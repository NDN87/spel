package com.example.spel.stensaxpase;

import com.example.spel.model.GameId;
import com.example.spel.model.Player;
import com.example.spel.model.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
public class StenSaxPaseController {

    private final Map<UUID, GameSession> gameSessions = new HashMap<>() {
    };

    @GetMapping("/games/{id}")
    public Player[] getGameStatus(@PathVariable UUID id) {
        return getGameSession(id).GetStatus();
    }

    @GetMapping("/games/{id}/result")
    public Result winner(@PathVariable UUID id) {
        GameSession gameSession = getGameSession(id);
        return gameSession.GetResult();
    }

    @PostMapping("/games")
    public GameId games(@RequestBody Player host) {
        if (host.getName() == null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Name is required");
        GameId id = new GameId();
        GameSession session = new GameSession(host);
        gameSessions.put(id.getId(), session);
        return id;
    }

    @PostMapping("/games/{id}/join")
    public void join(@PathVariable UUID id, @RequestBody Player joiner) {
        GameSession gameSession = getGameSession(id);
        if (gameSession.isAvailableToJoin()) {
            gameSession.AddPlayer(joiner);
        } else
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Game is full.");
    }

    @PostMapping("/games/{id}/move")
    public void move(@PathVariable UUID id, @RequestBody Player mover) {
        GameSession gameSession = getGameSession(id);
        gameSession.MakeMove(mover);
    }

    private GameSession getGameSession(UUID id) {
        try {
            return gameSessions.get(id);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Gameid was not found", ex);
        }
    }

}
