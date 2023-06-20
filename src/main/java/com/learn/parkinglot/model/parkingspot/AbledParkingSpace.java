package com.learn.parkinglot.model.parkingspot;

import com.learn.parkinglot.model.enums.ParkingSpaceType;

public class AbledParkingSpace extends ParkingSpace{
    public AbledParkingSpace(String parkingSpaceId) {
        super(parkingSpaceId, ParkingSpaceType.ABLED);
    }
}
