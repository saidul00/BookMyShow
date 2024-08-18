package com.saidul.BookMyShow.exception;

import com.saidul.BookMyShow.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CityExceptionHandler {
    @ExceptionHandler(CityAlreadyExistException.class)

    public ResponseEntity<ExceptionResponseDTO> handleCityAlreadyExistException(CityAlreadyExistException exception){
        ExceptionResponseDTO responseDTO = new ExceptionResponseDTO(exception.getMessage(), 409);

        return new ResponseEntity<>(responseDTO, HttpStatus.CONFLICT);
    }
}
