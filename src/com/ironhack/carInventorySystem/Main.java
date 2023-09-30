package com.ironhack.carInventorySystem;

import java.util.*;

public class Main {
    public static void main(String[] args){
        UtilityVehicle UT =new UtilityVehicle("1421","Japanese","2019",50000,true);
        System.out.println(UT.getInfo());
        UT.setFourWheelDrive(false);
        System.out.println(UT.getInfo());

        Truck TR = new Truck("1321","Toyota","Camry",20000,1600.00);
        System.out.println(TR.getInfo());
        TR.setTowingCapacity(1700.00);
        System.out.println(TR.getInfo());
    }
}

