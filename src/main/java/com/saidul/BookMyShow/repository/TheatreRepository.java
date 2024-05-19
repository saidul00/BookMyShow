package com.saidul.BookMyShow.repository;
import com.saidul.BookMyShow.model.Theatre;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface TheatreRepository extends MongoRepository<Theatre, UUID> {
}
