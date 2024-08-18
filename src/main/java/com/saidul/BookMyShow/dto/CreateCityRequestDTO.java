package com.saidul.BookMyShow.dto;

import com.saidul.BookMyShow.model.City;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.ArrayList;

@Getter
@Setter
public class CreateCityRequestDTO {
    private String name;
    public static City from(CreateCityRequestDTO dto){
        City city = new City();
        city.setName(dto.name);
        city.setTheatreList(new ArrayList<>());
        return city;
    }
}
