package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.City;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface CityRepository extends MongoRepository<City, ObjectId> {
     Optional<City> findCityByName(String name);
}
