package com.saidul.BookMyShow.exception;

import com.saidul.BookMyShow.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TicketExceptionHandler {
    @ExceptionHandler(ShowSeatUnavailableException.class)

    public ResponseEntity<ExceptionResponseDTO> handleShowSeatUnavailableException(ShowSeatUnavailableException exception){
        ExceptionResponseDTO responseDTO= new ExceptionResponseDTO(exception.getMessage(), 410);

        return new ResponseEntity<>(responseDTO, HttpStatus.GONE);
    }
}
