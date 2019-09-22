package com.tanju.designpatterns.creational.factorymethod;

public class WindowsDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
