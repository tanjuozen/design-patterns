package com.tanju.designpatterns.structural.flyweight;

/**
 * Object with Extrinsic state
 */
public class Order {

    private final int orderNumber;
    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    String processOrder() {
        return "Ordering " + item + " for order number " + orderNumber;
    }
}
