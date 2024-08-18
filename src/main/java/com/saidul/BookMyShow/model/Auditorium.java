package com.saidul.BookMyShow.model;

import com.saidul.BookMyShow.model.constant.AuditoriumFeature;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    private List<Show> shows;
    private List<Seat> seats;
    private List<AuditoriumFeature> features;
}
