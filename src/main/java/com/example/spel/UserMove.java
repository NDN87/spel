package com.example.spel;

public class UserMove {
    private String name;
    private final PlayType move;
    public UserMove(){
        name = "";
        move = null;
    }
    public UserMove(Player player) {
        name = player.getName();
        move = null;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public PlayType getMove(){
        return this.move;
    }
}
