package com.tanju.designpatterns.creational.prototype;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public abstract class Shape {
    int x;
    int y;
    String color;

    public Shape() {
    }

    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    protected abstract Shape clone();
}
