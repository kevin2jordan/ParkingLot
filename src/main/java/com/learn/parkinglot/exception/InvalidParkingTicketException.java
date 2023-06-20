package com.learn.parkinglot.exception;

public class InvalidParkingTicketException extends RuntimeException{
    public InvalidParkingTicketException(String message) {
        super(message);
    }
}
