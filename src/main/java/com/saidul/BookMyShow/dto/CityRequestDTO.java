package com.saidul.BookMyShow.dto;

import com.saidul.BookMyShow.model.City;
import com.saidul.BookMyShow.model.Theatre;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CityRequestDTO {
    private String name;
    public static City from(CityRequestDTO dto){
        City city = new City();
        city.setName(dto.getName());
        city.setTheatreList(new ArrayList<>());

        return city;
    }
}
