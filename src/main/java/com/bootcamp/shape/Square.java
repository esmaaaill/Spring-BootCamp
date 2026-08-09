package com.bootcamp.shape;

public class Square implements Shape {
    private Draw2d myDraw2d;

    public void setMyDraw2d(Draw2d myDraw2d) {
        this.myDraw2d = myDraw2d;
    }

    @Override
    public void draw() {
        myDraw2d.drawShape("SQuare");
    }
}
