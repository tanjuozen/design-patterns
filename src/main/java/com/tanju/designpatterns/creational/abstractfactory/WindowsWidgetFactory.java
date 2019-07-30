package com.tanju.designpatterns.creational.abstractfactory;

public class WindowsWidgetFactory implements WidgetFactory {

    private static WindowsWidgetFactory INSTANCE;

    private WindowsWidgetFactory() {
    }

    public static WindowsWidgetFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new WindowsWidgetFactory();
        }
        return INSTANCE;
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
