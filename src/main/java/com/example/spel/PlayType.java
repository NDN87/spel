package com.example.spel;

import java.util.Locale;

public enum PlayType {

    ROCK("rock"){
        @Override
        public boolean beats(PlayType other){
            return other ==  SCISSORS;

        }
    },
    PAPER("paper"){
        @Override
        public boolean beats(PlayType other){
            return other ==  ROCK;

        }
    },
    SCISSORS("scissors"){
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
            case "scissors":
                return SCISSORS;
            default:
                return null;
        }
    }
    public abstract boolean beats(PlayType other);
    PlayType(String play) {
        this.string = play.toLowerCase();
    }


}
