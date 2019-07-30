package com.tanju.designpatterns.creational.abstractfactory;

public class MacWindow implements Window {

    private String title;

    public MacWindow() {
        this.title = "MAC Title";
    }

    @Override
    public String getTitle() {
        if(this.title == null) {
            return "NO TITLE";
        }
        return this.title;
    }
}
