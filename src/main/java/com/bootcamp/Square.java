package com.bootcamp;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {
    private Draw2d myDraw;

    public Square() {
    }

    public void setMyDraw(Draw2d myDraw) {
        this.myDraw = myDraw;
    }

    @Override
    public void draw() {
        myDraw.drawShape("Square");
    }

    @Override
    public double getArea(double value) {
        return value * value;
    }
}
