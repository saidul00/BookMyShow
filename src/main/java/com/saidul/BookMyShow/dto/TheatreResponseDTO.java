package com.saidul.BookMyShow.dto;

import com.saidul.BookMyShow.model.Theatre;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TheatreResponseDTO {
    private String name;
    private String address;
    private String city;

    public static TheatreResponseDTO from(Theatre theatre){
        TheatreResponseDTO responseDTO = new TheatreResponseDTO();
        responseDTO.name = theatre.getName();
        responseDTO.address = theatre.getAddress();
        responseDTO.city = String.valueOf(theatre.getCityId());

        return responseDTO;
    }

}
