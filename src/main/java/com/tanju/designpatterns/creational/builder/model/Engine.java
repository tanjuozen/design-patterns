package com.tanju.designpatterns.creational.builder.model;

import lombok.Data;

@Data
public class Engine {

    private float size;
    private int horsePower;

    public Engine(float size, int horsePower) {
        this.size = size;
        this.horsePower = horsePower;
    }
}
