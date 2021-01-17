package com.example.spel.model;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class GameId {

    private final UUID id;

    public GameId() {
        this.id = UUID.randomUUID();
    }
    public GameId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
