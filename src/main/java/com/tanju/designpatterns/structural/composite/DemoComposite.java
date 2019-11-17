package com.tanju.designpatterns.structural.composite;

import java.awt.*;

public class DemoComposite {
    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor();

        imageEditor.loadShapes(new Circle(10,10,10, Color.BLACK),
                new CompoundShape(
                        new Circle(110, 110, 50, Color.YELLOW),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                ));
    }
}
