package com.example.spel.model;

import com.example.spel.model.PlayType;
import com.example.spel.model.PlayerStatus;

public class Status {

    private PlayerStatus playerStatus[] = new PlayerStatus[2];
    private PlayType moves[];
    private String name;

    public Status(String name) {
        this.name = name;
    }

    public PlayerStatus[] getStatus() {
        return this.playerStatus;
    }

    public PlayType[] getMoves(String value) {
        if(playerStatus[0] == PlayerStatus.READY && playerStatus[1] == PlayerStatus.READY){
            return moves;
        }
        return null;
    }

    public String getName() {
        return name;
    }
}

