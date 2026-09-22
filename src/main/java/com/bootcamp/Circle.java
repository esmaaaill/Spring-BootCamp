package com.bootcamp;

public class Circle implements Shape {
    private Draw2d myDraw;

    public Circle(Draw2d myDraw) {
        this.myDraw = myDraw;
    }

    @Override
    public void draw() {
        myDraw.drawShape("circle");
    }
}
