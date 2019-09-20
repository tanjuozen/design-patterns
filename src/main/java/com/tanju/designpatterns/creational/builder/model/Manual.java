package com.tanju.designpatterns.creational.builder.model;

import lombok.Data;

@Data
public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GpsNavigator gpsNavigator;
}
