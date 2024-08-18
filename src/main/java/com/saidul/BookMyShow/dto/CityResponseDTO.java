package com.saidul.BookMyShow.dto;

import com.saidul.BookMyShow.model.City;
import com.saidul.BookMyShow.model.Theatre;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CityResponseDTO {
    private String name;
    private List<String> theatres;

    public static CityResponseDTO from(City city){
        CityResponseDTO responseDTO = new CityResponseDTO();
        responseDTO.name = city.getName();

        if(!city.getTheatreList().isEmpty()){
            List<String> theatreName = city.getTheatreList().stream().map(Theatre :: getName).toList();
            responseDTO.setTheatres(theatreName);
        }
        return responseDTO;
    }
}
