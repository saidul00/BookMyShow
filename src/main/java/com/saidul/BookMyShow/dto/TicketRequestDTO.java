package com.saidul.BookMyShow.dto;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;


@Getter
@Setter
public class TicketRequestDTO {
    private List<ObjectId> showSeatIds;
    private ObjectId userId;
}
