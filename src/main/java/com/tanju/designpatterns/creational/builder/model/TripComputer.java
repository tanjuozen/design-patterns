package com.tanju.designpatterns.creational.builder.model;

import lombok.Data;

@Data
public class TripComputer {
    private double fuel;

    public TripComputer(double fuel) {
        this.fuel = fuel;
    }
}
