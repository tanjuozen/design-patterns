package com.tanju.designpatterns.creational.factorymethod;

public class MacDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new MacButton();
    }
}
