package com.saidul.BookMyShow.model;


import com.saidul.BookMyShow.model.constant.FilmFeature;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@Document

public class Film extends BaseModel {
    private String name;
    private String description;
    private LocalDateTime releaseDate;
    private List<Actor> cast;
    private List<FilmFeature> features;
    private double rating;
}
