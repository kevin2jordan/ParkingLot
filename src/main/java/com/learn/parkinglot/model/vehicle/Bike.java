package com.learn.parkinglot.model.vehicle;


import com.learn.parkinglot.model.enums.VehicleType;

public class Bike extends Vehicle{
    public Bike(String licenseNumber) {
        super(licenseNumber, VehicleType.BIKE);
    }
}
