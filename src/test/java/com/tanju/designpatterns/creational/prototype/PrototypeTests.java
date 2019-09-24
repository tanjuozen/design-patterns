package com.tanju.designpatterns.creational.prototype;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrototypeTests {

    @Test
    public void testCirclePrototype() {
        Circle originalCircle = new Circle();
        originalCircle.x = 10;
        originalCircle.y = 20;
        originalCircle.radius = 5;
        originalCircle.color = "blue";

        Shape cloneCircle = originalCircle.clone();

        assertThat(cloneCircle != originalCircle).isTrue();
        assertThat(cloneCircle).isEqualTo(originalCircle);
    }

    @Test
    public void testRectangularPrototype() {
        Rectangle originalRectangle = new Rectangle();
        originalRectangle.height = 10;
        originalRectangle.width = 20;
        originalRectangle.color = "red";

        Shape cloneRectangle = originalRectangle.clone();
        assertThat(cloneRectangle != originalRectangle).isTrue();
        assertThat(cloneRectangle).isEqualTo(originalRectangle);
    }
}
