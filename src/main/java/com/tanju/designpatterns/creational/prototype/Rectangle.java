package com.tanju.designpatterns.creational.prototype;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle() {
    }

    public Rectangle(Rectangle source) {
        super(source);
        this.height = source.height;
        this.width = source.width;
    }

    @Override
    protected Shape clone() {
        return new Rectangle(this);
    }
}
