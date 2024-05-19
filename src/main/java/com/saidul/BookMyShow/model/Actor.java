package com.saidul.BookMyShow.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
public class Actor extends BaseModel{
    private String name;
    private String gender;
    private List<Film> filmography;
}
