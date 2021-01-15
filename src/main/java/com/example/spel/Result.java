package com.example.spel;

public class Result {
    private String winner;
    private boolean draw;

    public Result(Player[] players){
        this.draw = false;
        if(players[0].getMove().beats(players[1].getMove())){
            this.winner = players[0].getName();
        }
        else if(players[1].getMove().beats(players[2].getMove())){
            this.winner = players[1].getName();
        }
        else {
            this.draw = true;
        }
    }

    public String getWinner(){return winner;}
    public boolean getDraw(){return draw;}
}
