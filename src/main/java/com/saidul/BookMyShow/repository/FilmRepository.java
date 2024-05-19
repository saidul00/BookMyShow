package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Film;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaAttributeConverter<Film,Integer> {
}
