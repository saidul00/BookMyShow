package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;


public interface FilmRepository extends MongoRepository<Film, UUID> {
}
