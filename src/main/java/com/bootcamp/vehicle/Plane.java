package com.bootcamp.vehicle;

public class Plane implements Vehicle {
    private DatabaseOps dbOp;

    public void setDbOp(DatabaseOps dbOp) {
        this.dbOp = dbOp;
    }

    @Override
    public void save() {
        dbOp.saveToDatabase("Plane");
    }
}
