package com.saidul.BookMyShow.exception;

public class CityAlreadyExistException extends RuntimeException{
    public CityAlreadyExistException(String message) {
        super(message);
    }
}
