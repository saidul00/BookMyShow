package com.saidul.BookMyShow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponseDTO {
    private String message;
    private int statusCode;

    public ExceptionResponseDTO(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }
}
