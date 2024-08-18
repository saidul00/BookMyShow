package com.saidul.BookMyShow.controller;

import com.saidul.BookMyShow.dto.TicketRequestDTO;
import com.saidul.BookMyShow.dto.TicketResponseDTO;
import com.saidul.BookMyShow.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    private final TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService=ticketService;
    }

    @PostMapping
    public ResponseEntity<TicketResponseDTO> bookTicket(@RequestBody TicketRequestDTO ticketRequestDTO) {
        return null;
    }
}
