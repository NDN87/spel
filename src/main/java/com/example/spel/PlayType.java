package com.example.spel;

public enum PlayType {

    ROCK{
        @Override
        public boolean beats(PlayType other){
            return other ==  SCISSOR;

        }
    },
    PAPER{
        @Override
        public boolean beats(PlayType other){
            return other ==  ROCK;

        }
    },
    SCISSOR{
        @Override
        public boolean beats(PlayType other){
            return other ==  PAPER;

        }
    };

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
}