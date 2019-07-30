package com.tanju.designpatterns.creational.abstractfactory;

public class WindowsWindow implements Window {

    private String title;

    public WindowsWindow() {
        this.title = "Windows Title";
    }

    @Override
    public String getTitle() {
        if (this.title == null) {
            return "NO TITLE";
        }
        return this.title;
    }
}
