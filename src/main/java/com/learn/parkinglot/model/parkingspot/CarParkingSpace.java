package com.learn.parkinglot.model.parkingspot;


import com.learn.parkinglot.model.enums.ParkingSpaceType;

public class CarParkingSpace extends ParkingSpace{
    public CarParkingSpace(String parkingSpaceId) {
        super(parkingSpaceId, ParkingSpaceType.CAR);
    }
}
