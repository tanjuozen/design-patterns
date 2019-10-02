package com.tanju.designpatterns.structural.adaptor;

public class SquarePegToRoundHoleAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegToRoundHoleAdapter(SquarePeg squarePeg) {
        this.peg = squarePeg;
    }

    @Override
    public double getRadius() {
        // assume max radius of the outer circle is r:
        // biggest square that can fit in has a width of (r * sqrt(2))
        return this.peg.getWidth() * Math.sqrt(2) / 2;
    }
}
