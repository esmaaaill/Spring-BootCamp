package com.bootcamp.vehicle;

public class Car implements Vehicle {
    private DatabaseOps dbOp;

    public Car(DatabaseOps dbOp) {
        this.dbOp = dbOp;
    }

    @Override
    public void save() {
        dbOp.saveToDatabase("Car");
    }
}
