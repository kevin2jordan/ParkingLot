package com.learn.parkinglot.model.vehicle;

import com.learn.parkinglot.model.enums.VehicleType;

public class Truck extends Vehicle {
    public Truck(String licenseNumber) {
        super(licenseNumber, VehicleType.TRUCK);
    }
}
