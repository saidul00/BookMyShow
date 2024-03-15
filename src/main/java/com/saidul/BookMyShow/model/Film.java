package com.saidul.BookMyShow.model;

import com.saidul.BookMyShow.model.Actor;
import com.saidul.BookMyShow.model.BaseModel;
import com.saidul.BookMyShow.model.constant.FilmFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@Entity

public class Film extends BaseModel {
    private String name;
    private String description;
    private LocalDateTime releaseDate;
    @ManyToMany
    private List<Actor> cast;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<FilmFeature> features;
    private double rating;
}
