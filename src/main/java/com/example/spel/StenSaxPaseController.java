package com.example.spel;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class StenSaxPaseController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final Map<UUID, GameSession> gameSessions = new HashMap<>() {
    };

    @GetMapping("games/{id}")
    public @ResponseBody GameState getGameState(@PathVariable UUID id){
        //System.err.println(id);
        return gameSessions.get(id).GetState();
    }

    @PostMapping("/games")
    public GameId games(@RequestBody Player host) {
        GameId id = new GameId();
        GameSession session = new GameSession(host);
        gameSessions.put(id.getId(), session);
        return id;
    }





}