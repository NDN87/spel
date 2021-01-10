package com.example.spel;

import java.util.UUID;

public class GameSession {
    private final UserMove[] moves = new UserMove[2];
    public GameSession(Player player) {
        moves[0] = new UserMove(player);
    }

    public void AddPlayer(String player)
    {
        moves[1].setName(player);
    }

    public UserMove[] GetMoves(){
        return moves;
    }

    public Status GetStatus(){
        return new Status(String.format("Waiting for opponent for %s...", moves[0].getName()));
    }
}
