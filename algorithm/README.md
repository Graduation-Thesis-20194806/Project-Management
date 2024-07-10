# Algorithm

## Install dependencies

```
poetry install
```

## Run server

```
poetry run dev

poetry run start
```

### Status code

```
https://fastapi.tiangolo.com/reference/status/
```

## Debug mode

Debug mode is used to run matching score calculation for a specific list of user ids.
List of user ids can be set in the `server/app/settings/matching.json` file.

To run the server in debug mode, set the environment variable `DEBUG` to `True`. Then set `user_ids_to_debug` in the `server/app/settings/matching.json` file.

Note:

- `user_ids_to_debug` is a list of user ids with buyer role.
- Debug mode is only for testing purposes.
- Debug mode only used for matching score between seller with buyers.
