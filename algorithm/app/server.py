import uvicorn
from fastapi import FastAPI
from dotenv import load_dotenv
from os import getenv, system

load_dotenv()


Base.metadata.create_all(bind=engine)

app = FastAPI(servers=[{"url": getenv("BASE_URL")}])

origins = [getenv("SERVER_URL")]


def dev():
    """Launched with `poetry run dev` at root level"""
    uvicorn.run("app.server:app", host="0.0.0.0", port=8000, reload=True)


def start():
    """Launched with `poetry run start` at root level"""
    uvicorn.run("app.server:app", host="0.0.0.0", port=8000)
        "celery -A app.utils.queue.celery_app worker --loglevel=info --concurrency=10"
    )
