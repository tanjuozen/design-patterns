package com.tanju.designpatterns.structural.decorator;

public class MeatSandwichDecorator extends SandwichDecorator {

    public MeatSandwichDecorator(SimpleSandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return "Bacon";
    }
}
