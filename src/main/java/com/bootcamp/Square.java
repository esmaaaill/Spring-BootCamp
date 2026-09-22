package com.bootcamp;

public class Square implements Shape {
    private Draw2d myDraw;

    public void setMyDraw(Draw2d myDraw) {
        this.myDraw = myDraw;
    }

    @Override
    public void draw() {
        myDraw.drawShape("Square");
    }
}
