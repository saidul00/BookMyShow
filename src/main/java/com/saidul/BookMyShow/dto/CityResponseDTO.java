package com.saidul.BookMyShow.dto;

import com.saidul.BookMyShow.model.City;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityResponseDTO {
    private String name;
    public static CityResponseDTO from(City city){
        CityResponseDTO responseDTO = new CityResponseDTO();
        responseDTO.name = city.getName();
        return responseDTO;
    }
}
