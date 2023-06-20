package com.learn.parkinglot.model.vehicle;

import com.learn.parkinglot.model.ParkingTicket;
import com.learn.parkinglot.model.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Vehicle {
    private String licenseNumber;
    private VehicleType vehicleType;
    private ParkingTicket parkingTicket;

    public Vehicle(String licenseNumber, VehicleType vehicleType) {
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }
}
