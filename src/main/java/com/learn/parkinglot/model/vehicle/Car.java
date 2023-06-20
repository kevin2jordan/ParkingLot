package com.learn.parkinglot.model.vehicle;

import com.learn.parkinglot.model.enums.VehicleType;

public class Car extends Vehicle{
    public Car(String licenseNumber) {
        super(licenseNumber, VehicleType.CAR);
    }
}
