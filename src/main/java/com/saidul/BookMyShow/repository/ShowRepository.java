package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Show;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ShowRepository extends MongoRepository<Show, UUID> {
}
