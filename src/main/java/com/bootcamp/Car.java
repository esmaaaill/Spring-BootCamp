package com.bootcamp;

public class Car implements Vehicle {
    private DatabaseOperation dbOp;

    public Car(DatabaseOperation dbOp) {
        this.dbOp = dbOp;
    }

    @Override
    public void save() {
        dbOp.saveToDatabase();
    }
}
