package com.saidul.BookMyShow.dto;

import com.saidul.BookMyShow.model.Theatre;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import org.bson.types.ObjectId;

import java.util.ArrayList;

@Getter
@Setter
public class TheatreRequestDTO {
    private String name;
    private String address;
    private ObjectId cityId;
    public static Theatre from(TheatreRequestDTO theatreRequestDTO){
        Theatre theatre = new Theatre();
        theatre.setName(theatreRequestDTO.getName());
        theatre.setAddress(theatreRequestDTO.getAddress());
        theatre.setCityId(theatreRequestDTO.getCityId());
        theatre.setAuditoriums(new ArrayList<>());

        return theatre;
    }
}
