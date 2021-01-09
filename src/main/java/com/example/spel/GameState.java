package com.example.spel;

import java.util.HashMap;
import java.util.Map;

public class GameState {
    Map<Player, PlayType> state = new HashMap<>() {};
    private final PlayType[] plays = new PlayType[2];
    public GameState() {
    }

    public Map<Player, PlayType> getState() {
        return state;
    }

    public PlayType[] getPlays() {
        return plays;
    }
}
