package com.learn.parkinglot.exception;

public class GateAlreadyExistException extends RuntimeException{

    public GateAlreadyExistException(String message) {
        super(message);
    }
}
