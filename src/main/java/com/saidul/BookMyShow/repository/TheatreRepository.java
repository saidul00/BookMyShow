package com.saidul.BookMyShow.repository;
import com.saidul.BookMyShow.model.Theatre;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TheatreRepository extends MongoRepository<Theatre, ObjectId> {
}
