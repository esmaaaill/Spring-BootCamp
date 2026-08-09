package com.bootcamp.shape;

public class Circle implements Shape {
    private Draw2d myDraw2d;

    public Circle(Draw2d myDraw2d) {
        this.myDraw2d = myDraw2d;
    }

    @Override
    public void draw() {
        myDraw2d.drawShape("circle. ");
    }
}
