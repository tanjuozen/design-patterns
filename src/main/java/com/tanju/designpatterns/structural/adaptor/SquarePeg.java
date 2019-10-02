package com.tanju.designpatterns.structural.adaptor;

public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return Math.pow(this.width, 2);
    }
}
