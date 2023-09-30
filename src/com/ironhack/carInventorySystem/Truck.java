package com.ironhack.carInventorySystem;


public class Truck extends Car{
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {

        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {

        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return "Truck: The Vin Number:  " + vinNumber + ", make: " + make + ", model: " + model + ", mileage: " + mileage + ", Towing Capacity: " + towingCapacity;
    }
}

