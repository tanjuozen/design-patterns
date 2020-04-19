package com.tanju.designpatterns.structural.decorator;

public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make(){
     return this.customSandwich.make();
    }
}
