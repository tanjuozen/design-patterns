package com.tanju.designpatterns.creational.abstractfactory;

public class MacWidgetFactory implements WidgetFactory {

    private static MacWidgetFactory INSTANCE;

    private MacWidgetFactory() {
    }

    public static MacWidgetFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MacWidgetFactory();
        }
        return INSTANCE;
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}
