package com.bootcamp;

public class Plane implements Vehicle {
    private DatabaseOperation dbOp;

    public void setDbOp(DatabaseOperation dbOp) {
        this.dbOp = dbOp;
    }

    @Override
    public void save() {
        dbOp.saveToDatabase();
    }
}
