package com.learn.parkinglot.model.vehicle;


import com.learn.parkinglot.model.enums.VehicleType;

public class EBike extends Vehicle{

    public EBike(String licenseNumber) {
        super(licenseNumber, VehicleType.EBIKE);
    }
}
