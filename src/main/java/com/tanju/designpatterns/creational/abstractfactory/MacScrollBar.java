package com.tanju.designpatterns.creational.abstractfactory;

public class MacScrollBar implements ScrollBar {

    private String style;

    public MacScrollBar() {
        this.style = "MAC Style Scrollbar";
    }

    @Override
    public String getStyle() {
        if (this.style == null) {
            return "NO STYLES";
        }
        return this.style;
    }
}
