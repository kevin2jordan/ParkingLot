package com.learn.parkinglot.model.parkingspot;


import com.learn.parkinglot.model.enums.ParkingSpaceType;

public class BikeParkingSpace extends ParkingSpace{
    public BikeParkingSpace(String parkingSpaceId) {
        super(parkingSpaceId, ParkingSpaceType.BIKE);
    }
}
