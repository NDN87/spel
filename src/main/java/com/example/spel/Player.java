package com.example.spel;

public class Player {

    private String name;
    private PlayerStatus playerStatus;
    private PlayType move;

    public Player(String name) {
        this.name = name;
        this.playerStatus = PlayerStatus.NOT_READY;
    }
    public Player(Player copyMe) {
        this.name = copyMe.getName();
        this.playerStatus = copyMe.getPlayerStatus();
        this.move = copyMe.getMove();
    }

    public Player() {
        this.playerStatus = PlayerStatus.NOT_READY;
    }

    public void DeletePlay(){
        this.move = null;
    }

    public PlayType getMove(){
        return this.move;
    }
    public PlayerStatus getPlayerStatus() {
        return this.playerStatus;
    }

    public String getName() {
        return this.name;
    }

    public void setMove(PlayType move) {
        this.move = move;
        if(move != null) this.playerStatus = PlayerStatus.READY;
    }
}
