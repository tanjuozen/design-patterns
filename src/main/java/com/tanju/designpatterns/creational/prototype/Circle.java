package com.tanju.designpatterns.creational.prototype;


import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Circle extends Shape {
    int radius;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    protected Shape clone() {
        return new Circle(this);
    }
}
