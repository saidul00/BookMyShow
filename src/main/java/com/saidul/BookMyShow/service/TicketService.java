package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.dto.TicketRequestDTO;
import com.saidul.BookMyShow.dto.TicketResponseDTO;

public interface TicketService {
    TicketResponseDTO bookTicket(TicketRequestDTO ticketRequestDTO);
}
