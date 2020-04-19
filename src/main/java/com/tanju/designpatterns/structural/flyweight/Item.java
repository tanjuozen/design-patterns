package com.tanju.designpatterns.structural.flyweight;

/**
 * Flyweight Object with Intrinsic state
 */
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
