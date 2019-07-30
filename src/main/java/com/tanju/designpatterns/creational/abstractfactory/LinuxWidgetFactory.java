package com.tanju.designpatterns.creational.abstractfactory;

public class LinuxWidgetFactory implements WidgetFactory {

    private static LinuxWidgetFactory INSTANCE;

    private LinuxWidgetFactory() {
    }

    public static LinuxWidgetFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LinuxWidgetFactory();
        }
        return INSTANCE;
    }

    @Override
    public ScrollBar createScrollBar() {
        return new LinuxScrollBar();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
