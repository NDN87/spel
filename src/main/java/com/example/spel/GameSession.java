package com.example.spel;

import org.apache.catalina.User;

import java.util.UUID;

public class GameSession {
    private final UserMove[] moves = new UserMove[2];
    public GameSession(Player player) {
        moves[0] = new UserMove(player);
    }

    public boolean isAvailableToJoin(){
        return moves[1] == null;
    }

    public void AddPlayer(Player player)
    {
        moves[1] = new UserMove(player);
    }

    public UserMove[] GetMoves(){
        return moves;
    }

    public Status GetStatus(){
        if(moves[1] == null){
            return new Status(String.format("Waiting for opponent for %s...", moves[0].getName()));
        }
        return new Status("Waiting for both opponents to make their move.");
    }
}
