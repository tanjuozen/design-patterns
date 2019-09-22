package com.tanju.designpatterns.creational.factorymethod;

public class MacButton implements Button {
    @Override
    public String render() {
        return "Mac being rendered";
    }
}
