package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Ticket;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TicketRepository extends MongoRepository<Ticket, ObjectId> {
}
