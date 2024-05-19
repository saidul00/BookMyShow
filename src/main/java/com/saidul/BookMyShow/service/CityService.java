package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.dto.CityRequestDTO;
import com.saidul.BookMyShow.dto.CityResponseDTO;

import java.util.UUID;

public interface CityService {
    CityResponseDTO createCity(CityRequestDTO cityRequestDTO);
    CityResponseDTO getCityByName(String name);
    boolean deleteCity(UUID cityId);
}
