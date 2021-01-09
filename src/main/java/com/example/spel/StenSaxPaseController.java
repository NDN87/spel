package com.example.spel;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class StenSaxPaseController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final List<GameSession> gameSessions = new ArrayList<>();

    @PostMapping("/games")
    public GameId game(@RequestBody Player player) {
        GameId id = new GameId();
        GameSession session = new GameSession(id);
        session.AddPlayer(player);
        gameSessions.add(session);
        return id;
    }

}