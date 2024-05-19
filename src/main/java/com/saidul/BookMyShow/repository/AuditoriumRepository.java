package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Auditorium;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface AuditoriumRepository extends MongoRepository<Auditorium, UUID> {
}
