package com.learn.parkinglot.exception;

public class ParkingSpaceAlreadyExist extends RuntimeException{
    public ParkingSpaceAlreadyExist(String message){
        super(message);
    }
}
