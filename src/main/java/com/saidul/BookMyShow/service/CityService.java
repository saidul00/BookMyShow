package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.dto.CityRequestDTO;
import com.saidul.BookMyShow.dto.CityResponseDTO;
import org.bson.types.ObjectId;


public interface CityService {
    CityResponseDTO createCity(CityRequestDTO cityRequestDTO);
    CityResponseDTO getCityByName(String name);
    boolean deleteCity(ObjectId cityId);
}
