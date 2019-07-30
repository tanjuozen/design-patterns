package com.tanju.designpatterns.creational.abstractfactory;

public class LinuxWindow implements Window {
    private String title;

    public LinuxWindow() {
        this.title = "Linux Title";
    }

    @Override
    public String getTitle() {
        if (this.title == null) {
            return "NO TITLE";
        }
        return this.title;
    }
}
