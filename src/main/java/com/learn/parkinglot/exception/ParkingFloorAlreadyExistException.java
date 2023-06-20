package com.learn.parkinglot.exception;

public class ParkingFloorAlreadyExistException extends RuntimeException{
    public ParkingFloorAlreadyExistException(String message) {
        super(message);
    }
}
