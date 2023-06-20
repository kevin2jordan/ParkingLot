package com.learn.parkinglot.model.parkingspot;


import com.learn.parkinglot.model.enums.ParkingSpaceType;

public class EBikeParkingSpace extends ParkingSpace{
    public EBikeParkingSpace(String parkingSpaceId) {
        super(parkingSpaceId, ParkingSpaceType.EBIKE);
    }
}
