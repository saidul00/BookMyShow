package com.saidul.BookMyShow.model;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
public class Theatre extends BaseModel{
    private String name;
    private String address;
    private ObjectId cityId;
    private List<Auditorium> auditoriums;
}
