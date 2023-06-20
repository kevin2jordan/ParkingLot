package com.learn.parkinglot.strategy;

import com.learn.parkinglot.model.enums.ParkingSpaceType;

public interface PricingStrategy {
    Double getPrice(ParkingSpaceType parkingSpaceType);
}
