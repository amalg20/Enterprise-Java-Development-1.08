package com.ironhack.carInventorySystem;


public abstract class Car {
    protected String vinNumber;
    protected String make;
    protected String model;
    protected int mileage;
    //constructor
    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }
    // getters and setters omitted for brevity
    public String getVinNumber() {

        return vinNumber;
    }
    public String getMake() {

        return make;
    }
    public String getModel() {

        return model;
    }
    public int getMileage() {

        return mileage;
    }
    public void setVinNumber(String vinNumber) {

        this.vinNumber = vinNumber;
    }
    public void setMake(String make) {

        this.make = make;
    }
    public void setModel(String model) {

        this.model = model;
    }
    public void setMileage(int mileage) {

        this.mileage = mileage;
    }
    public abstract String getInfo();

}

