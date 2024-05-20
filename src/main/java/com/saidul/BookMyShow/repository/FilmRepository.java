package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Film;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface FilmRepository extends MongoRepository<Film, ObjectId> {
}
