package com.tanju.designpatterns.structural.adaptor;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SquarePegToRoundHoleAdapterTests {

    @Test
    public void testAdapter() {
        // Test round peg
        RoundHole hole = new RoundHole(6);
        RoundPeg roundPeg = new RoundPeg(5);

        assertTrue(hole.fits(roundPeg));

        // Adapt square peg interface to round hole
        SquarePeg squarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        SquarePegToRoundHoleAdapter adapter = new SquarePegToRoundHoleAdapter(squarePeg);
        SquarePegToRoundHoleAdapter largeAdapter = new SquarePegToRoundHoleAdapter(largeSquarePeg);

        assertTrue(hole.fits(adapter));
        assertFalse(hole.fits(largeAdapter));
    }
}
