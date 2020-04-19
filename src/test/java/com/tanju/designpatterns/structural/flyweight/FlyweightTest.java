package com.tanju.designpatterns.structural.flyweight;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FlyweightTest {


    @Test
    public void testFlyweight() {
        InventorySystem inventorySystem = new InventorySystem();
        inventorySystem.takeOrder("test1", 1);
        inventorySystem.takeOrder("test2", 2);
        inventorySystem.takeOrder("test3", 3);
        inventorySystem.takeOrder("test1", 10);
        inventorySystem.takeOrder("test1", 123);
        inventorySystem.takeOrder("test1", 222);
        inventorySystem.takeOrder("test1", 333);
        inventorySystem.takeOrder("test1", 444);
        inventorySystem.takeOrder("test2", 555);
        inventorySystem.takeOrder("test3", 666);
        inventorySystem.takeOrder("test1", 777);

        inventorySystem.process();

        assertThat(inventorySystem.report()).isEqualTo("Total Item objects made: 3");
    }
}