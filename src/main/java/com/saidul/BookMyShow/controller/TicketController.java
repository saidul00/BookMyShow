package com.saidul.BookMyShow.controller;

import com.saidul.BookMyShow.dto.BookTicketRequestDTO;
import com.saidul.BookMyShow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;
    @PostMapping("/ticket")
    public ResponseEntity bookTicket(@RequestBody BookTicketRequestDTO bookTicketRequestDTO) throws Exception {
        try {
            if(bookTicketRequestDTO.getUserId() == null){
                throw new Exception("User ID cannot be empty");
            } else if (bookTicketRequestDTO.getShowSeatIds().isEmpty()) {
                throw new Exception("Show seat cannot be empty");
            }
            return ResponseEntity.ok(
                    ticketService.bookTicket(bookTicketRequestDTO.getShowSeatIds(), bookTicketRequestDTO.getUserId())
            );
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
