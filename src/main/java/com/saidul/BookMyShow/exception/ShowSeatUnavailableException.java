package com.saidul.BookMyShow.exception;

public class ShowSeatUnavailableException extends RuntimeException{
    public ShowSeatUnavailableException(String message) {
        super(message);
    }
}
