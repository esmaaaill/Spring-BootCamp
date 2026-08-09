package com.bootcamp;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
    private Draw2d myDraw;

    public Circle() {
    }

    public Circle(Draw2d myDraw) {
        this.myDraw = myDraw;
    }

    @Override
    public void draw() {
        myDraw.drawShape("circle");
    }

    @Override
    public double getArea(double value) {
        return 2 * Math.PI * value;
    }
}
