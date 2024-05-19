package com.saidul.BookMyShow.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class TheatreRequestDTO {
    private String name;
    private String address;
    private UUID cityId;
}
