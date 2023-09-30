package com.ironhack.carInventorySystem;


public class Sedan extends Car{

    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }
    @Override

    public String getInfo() {
        return "Sedan: The Vin Number: " + vinNumber + ", make:  " + make + ", model:  " + model + ", mileage: " + mileage;
    }
}
