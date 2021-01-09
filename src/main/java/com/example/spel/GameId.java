package com.example.spel;

import java.util.UUID;

public class GameId {

    private final UUID id;

    public GameId() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}