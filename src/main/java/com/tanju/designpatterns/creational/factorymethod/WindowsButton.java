package com.tanju.designpatterns.creational.factorymethod;

public class WindowsButton implements Button {
    @Override
    public String render() {
        return "Windows being rendered";
    }
}
