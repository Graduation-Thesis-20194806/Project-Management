FROM python:3.12-alpine

RUN apk add --no-cache gcc musl-dev libffi-dev openssl-dev

WORKDIR /home/app

COPY . .

# Install python packages
RUN pip3 install poetry
RUN poetry install

CMD ["poetry", "run", "start"]