package com.tanju.designpatterns.creational.abstractfactory;

public class WindowsScrollBar implements ScrollBar {

    private String style;

    public WindowsScrollBar() {
        this.style = "Windows Style Scrollbar";
    }

    @Override
    public String getStyle() {
        if (this.style == null) {
            return "NO STYLES";
        }
        return this.style;
    }
}
