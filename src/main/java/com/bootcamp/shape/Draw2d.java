package com.bootcamp.shape;

public class Draw2d {
    public void drawShape(String shapeName) {
        if ("circle".equals(shapeName)) {
            System.out.println("Drawing a 2d for cricle");
        } else {
            System.out.println("Draw a 2d  " + shapeName);
        }
    }
}
