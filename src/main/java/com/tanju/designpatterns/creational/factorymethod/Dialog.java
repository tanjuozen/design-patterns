package com.tanju.designpatterns.creational.factorymethod;

public abstract class Dialog {

    public String render() {
        Button button = createButton();
        return button.render();
    }

    protected abstract Button createButton();
}
