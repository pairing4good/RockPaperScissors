package com.pairinggood.game;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class RockPaperScissors {

    public static final String SCISSORS = "scissors";
    public static final String ROCK = "rock";
    public static final String PAPER = "paper";

    public String play(String firstGesture, String secondGesture) {

        if (firstGesture.equals(secondGesture)) {
            return "draw";
        }

        List<String> gestures = new ArrayList<>();
        gestures.add(firstGesture);
        gestures.add(secondGesture);

        if (gestures.contains(PAPER) && gestures.contains(SCISSORS)) {
            return SCISSORS;
        }

        if (gestures.contains(PAPER) && gestures.contains(ROCK)) {
            return PAPER;
        }

        return ROCK;
    }
}
