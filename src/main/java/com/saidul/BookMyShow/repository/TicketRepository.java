package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface TicketRepository extends MongoRepository<Ticket, UUID> {
}
