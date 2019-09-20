package com.tanju.designpatterns.creational.builder;

import com.tanju.designpatterns.creational.builder.model.*;

public class Director {

    public void makeSportsCar(Builder builder) {
        builder.setType(Type.SPORT);
        builder.setSeats(2);
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(new GpsNavigator("Istanbul"));
        builder.setTripComputer(new TripComputer(65));
        builder.setEngine(new Engine(2.0f, 150));
    }

    public void makeFamilyCar(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(7);
        builder.setTransmission(Transmission.AUTO);
        builder.setGpsNavigator(new GpsNavigator("Washington"));
        builder.setTripComputer(new TripComputer(70));
        builder.setEngine(new Engine(3.0f, 200));
    }
}
