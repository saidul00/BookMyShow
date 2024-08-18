package com.saidul.BookMyShow.model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document

public class User extends BaseModel{
    private String name;
    private String email;
    private String mobile;
    private List<Ticket> tickets;
}
