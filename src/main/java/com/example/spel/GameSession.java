package com.example.spel;

import java.util.UUID;

public class GameSession {
    private final Player[] players = new Player[2];
    private final GameState state = new GameState();

    public GameSession(Player player) {
        players[0] = player;
    }

    public void AddPlayer(Player player)
    {
        players[1] = player;
    }

    public GameState GetState(){
        return state;
    }
}
