package com.ironhack.carInventorySystem;


public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }


    @Override
    public String getInfo() {
        return "Utility Vehicle: The vin Number:  " + vinNumber + ", make: " + make + ", model:  " + model + ", mileage: " + mileage +", Four Wheel Drive:  " + fourWheelDrive;
    }
}
