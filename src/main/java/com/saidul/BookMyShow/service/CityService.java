package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.dto.CreateCityRequestDTO;
import com.saidul.BookMyShow.dto.CityResponseDTO;
import com.saidul.BookMyShow.exception.CityAlreadyExistException;
import org.bson.types.ObjectId;


public interface CityService {
    CityResponseDTO createCity(CreateCityRequestDTO createCityRequestDTO);
    CityResponseDTO getCityByName(String name);
    boolean deleteCity(ObjectId cityId);
}
