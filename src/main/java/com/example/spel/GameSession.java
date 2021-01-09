package com.example.spel;

import java.util.UUID;

public class GameSession {
    private final GameId id;
    private final Player[] players = new Player[2];

    public GameSession(GameId id) {
        this.id = id;
    }

    public boolean AddPlayer(Player player)
    {
        for(int i = 0; i < 2; i++){
            if(players[i] == null){
                players[i] = player;
                return true;
            }
        }
        return false;
    }
}
