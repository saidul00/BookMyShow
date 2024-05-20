package com.saidul.BookMyShow.model;

import lombok.Getter;
import lombok.Setter;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.time.LocalDateTime;


@Getter
@Setter
@Document
public abstract class BaseModel {
    @Id
    private ObjectId id;
    @CreatedDate
    private LocalDateTime createdAt = LocalDateTime.now();
    @LastModifiedDate
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}
