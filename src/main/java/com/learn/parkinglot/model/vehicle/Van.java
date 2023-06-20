package com.learn.parkinglot.model.vehicle;

import com.learn.parkinglot.model.enums.VehicleType;

public class Van extends Vehicle{
    public Van(String licenseNumber) {
        super(licenseNumber, VehicleType.VAN);
    }
}
