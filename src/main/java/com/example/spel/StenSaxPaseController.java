package com.example.spel;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class StenSaxPaseController {

    private final Map<UUID, GameSession> gameSessions = new HashMap<>() {
    };

    @GetMapping("/games/{id}")
    public Status getGameStatus(@PathVariable UUID id){
        return gameSessions.get(id).GetStatus();
    }

    @PostMapping("/games")
    public GameId games(@RequestBody Player host) {
        GameId id = new GameId();
        GameSession session = new GameSession(host);
        gameSessions.put(id.getId(), session);
        return id;
    }

    @PostMapping("/games/{id}/join")
    public void join(@PathVariable UUID id, @RequestBody Player joiner) {
        GameSession gameSession = gameSessions.get(id);
        if(gameSession.isAvailableToJoin()){
            gameSession.AddPlayer(joiner);
        }
    }





}