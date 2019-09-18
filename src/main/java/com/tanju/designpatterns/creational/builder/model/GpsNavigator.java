package com.tanju.designpatterns.creational.builder.model;

import lombok.Data;

@Data
public class GpsNavigator {
    private String destination;

    public GpsNavigator(String destination) {
        this.destination = destination;
    }
}
