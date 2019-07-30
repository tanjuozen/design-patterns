package com.tanju.designpatterns.creational.abstractfactory;

public class LinuxScrollBar implements ScrollBar {

    private String style;

    public LinuxScrollBar() {
        this.style = "Linux Style Scrollbar";
    }

    @Override
    public String getStyle() {
        if (this.style == null) {
            return "NO STYLES";
        }
        return this.style;
    }
}
