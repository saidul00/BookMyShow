package com.saidul.BookMyShow.model.constant;

import com.saidul.BookMyShow.model.Actor;
import com.saidul.BookMyShow.model.BaseModel;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;

import java.time.LocalDateTime;
import java.util.List;

public class Film extends BaseModel {
    private String name;
    private LocalDateTime releaseDate;
    @ManyToMany
    private List<Actor> cast;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<FilmFeature> features;
    private double rating;
}
