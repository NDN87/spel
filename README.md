# StenSaxPase Backend
> This is a simple backend that supports game sessions of rock-scissors-paper.


## Curl examples

- info about game: `curl -H "Content-Type: application/json"  http://localhost:8080/games/$id`
- get result from game. `curl -H "Content-Type: application/json"  http://localhost:8080/games/$id/result`
- create game :  `curl -d '{"name": "daniel"}' -H "Content-Type: application/json" -X POST http://localhost:8080/games`
- join game: `curl -d '{"name":"josefin"}' -H "Content-Type: application/json" -X POST http://localhost:8080/games/$id/join`
- make move inside game: `curl -d '{"name":"josefin", "move":"ROCK"}' -H "Content-Type: application/json" -X POST http://localhost:8080/games/$id/move`

## Run
`./gradlew bootRun` to go!

## Features

To-do list:
* Unit tests.
* Support game of 3.
* Support rematches
* List available games (free to join)
