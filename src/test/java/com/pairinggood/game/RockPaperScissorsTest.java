package com.pairinggood.game;

import org.junit.Test;

import static com.pairinggood.game.RockPaperScissors.*;
import static org.junit.Assert.assertEquals;

public class RockPaperScissorsTest {

    private final RockPaperScissors game = new RockPaperScissors();

    @Test
    public void play_RockThenScissor_RockBeatsScissors() {
        assertEquals(ROCK, game.play(ROCK, SCISSORS));
    }

    @Test
    public void play_ScissorThenRock_RockBeatsScissors() {
        assertEquals(ROCK, game.play(SCISSORS, ROCK));
    }

    @Test
    public void play_PaperThenScissor_ScissorsBeatPaper() {
        assertEquals(SCISSORS, game.play(PAPER, SCISSORS));
    }

    @Test
    public void play_ScissorThenPaper_ScissorsBeatPaper() {
        assertEquals(SCISSORS, game.play(SCISSORS, PAPER));
    }

    @Test
    public void play_PaperThenRock_PaperBeatsRock() {
        assertEquals(PAPER, game.play(PAPER, ROCK));
    }
}
