package com.example.spel;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public Player(){
        name = "free";
    }

    public String getName(){return this.name;}
    public void setName(String newName){ this.name = newName;}
}
