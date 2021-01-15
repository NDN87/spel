package com.example.spel;

import org.apache.catalina.User;

import java.util.Arrays;

public class GameSession {
    private final Player[] players = new Player[2];
    public GameSession(Player player) {
        players[0] = player;
    }

    public boolean isAvailableToJoin(){
        return players[1] == null;
    }

    public void AddPlayer(Player player)
    {
        players[1] = player;
    }

    public Player[] GetStatus(){
        Player[] playersPublicInfo = Arrays.stream(players)
                .map(player -> player == null ? null : new Player(player))
                .toArray(Player[]::new);
        if(isAvailableToJoin())
            playersPublicInfo[0].DeletePlay();
        else if(waitingForPlayerMove()){
            playersPublicInfo[0].DeletePlay();
            playersPublicInfo[1].DeletePlay();
        }
        return playersPublicInfo;
    }

    private boolean waitingForPlayerMove(){
        return players[0].getPlayerStatus() != PlayerStatus.READY || players[1].getPlayerStatus() != PlayerStatus.READY;
    }

    public void MakeMove(Player mover) {
        Player p;
        if(players[0].getName().equals(mover.getName())) p = players[0];
        else if(players[1].getName().equals(mover.getName())) p = players[1];
        else return;
        p.setMove(mover.getMove());
    }

    public Result GetResult() {
        if(waitingForPlayerMove())
            return null;
        return new Result(players);
    }
}
