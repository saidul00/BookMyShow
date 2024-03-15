package com.saidul.BookMyShow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "BMS_USER")

public class User extends BaseModel{
    private String name;
    private String email;
    private String mobile;
    @OneToMany
    private List<Ticket> tickets;
}
