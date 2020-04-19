package com.tanju.designpatterns.structural.decorator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecoratorTest {

    @Test
    public void testDecoratorOneDecorator() {
        Sandwich withMeat = new MeatSandwichDecorator(new SimpleSandwich());
        String actualSandwich = withMeat.make();

        assertThat(actualSandwich).isNotNull();
        assertThat(actualSandwich).contains("Bread");
        assertThat(actualSandwich).contains("Bacon");
    }

    @Test
    public void testDecoratorTwoDecorators() {
        Sandwich withMeatAndDressing = new DressingSandwichDecorator(
                new MeatSandwichDecorator(new SimpleSandwich()));
        String actualSandwich = withMeatAndDressing.make();

        assertThat(actualSandwich).isNotNull();
        assertThat(actualSandwich).contains("Bread");
        assertThat(actualSandwich).contains("Bacon");
        assertThat(actualSandwich).contains("Caesar");
    }
}