package com.pairinggood.game;

import org.junit.Test;

import static com.pairinggood.game.RockPaperScissors.*;
import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    @Test
    public void play_RockThenScissor_RockBeatScissors() {
        //arrange
        RockPaperScissors game = new RockPaperScissors();

        //act
        String winner = game.play(ROCK, SCISSORS);

        //assert
        assertEquals(ROCK, winner);
    }

    @Test
    public void play_ScissorThenRock_RockBeatScissors() {
        //arrange
        RockPaperScissors game = new RockPaperScissors();

        //act
        String winner = game.play(SCISSORS, ROCK);

        //assert
        assertEquals(ROCK, winner);
    }

    @Test
    public void play_PaperThenScissor_ScissorsBeatPaper() {
        //arrange
        RockPaperScissors game = new RockPaperScissors();

        //act
        String winner = game.play(PAPER, SCISSORS);

        //assert
        assertEquals(SCISSORS, winner);
    }

    @Test
    public void play_ScissorThenPaper_ScissorsBeatPaper() {
        //arrange
        RockPaperScissors game = new RockPaperScissors();

        //act
        String winner = game.play(SCISSORS, PAPER);

        //assert
        assertEquals(SCISSORS, winner);
    }
}
