package com.example.spel;

import java.util.Locale;

public enum PlayType {

    ROCK("rock"){
        @Override
        public boolean beats(PlayType other){
            return other ==  SCISSOR;

        }
    },
    PAPER("paper"){
        @Override
        public boolean beats(PlayType other){
            return other ==  ROCK;

        }
    },
    SCISSOR("scissor"){
        @Override
        public boolean beats(PlayType other){
            return other ==  PAPER;

        }
    };
    private final String string;
    public static PlayType parseType(String value){
        switch (value.toLowerCase()){
            case "rock":
                return ROCK;
            case "paper":
                return PAPER;
            case "scissor":
                return SCISSOR;
            default:
                return null;
        }
    }
    public abstract boolean beats(PlayType other);
    PlayType(String play) {
        this.string = play.toLowerCase();
    }


}