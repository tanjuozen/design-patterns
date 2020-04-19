package com.tanju.designpatterns.structural.decorator;

public class DressingSandwichDecorator extends SandwichDecorator {
    public DressingSandwichDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return "Caesar";
    }
}
