package com.example.spel;

public class UserMove {
    private String name;
    private PlayType move;
    public UserMove(){
        name = "";
        move = null;
    }
    public UserMove(Player player) {
        name = player.getName();
        move = null;
    }
    public UserMove(UserMove copyMe) {
        name = copyMe.getName();
        move = copyMe.getMove();
    }
    public void setName(String n){
        this.name = n;
    }
    public void setMove(PlayType newMove) { move = newMove;}
    public String getName(){
        return this.name;
    }
    public PlayType getMove(){
        return this.move;
    }

}
