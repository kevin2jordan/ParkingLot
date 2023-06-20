package com.learn.parkinglot.exception;

public class ParkingLotAlreadyExistException extends RuntimeException{
    public ParkingLotAlreadyExistException(String message){
        super(message);
    }
}
