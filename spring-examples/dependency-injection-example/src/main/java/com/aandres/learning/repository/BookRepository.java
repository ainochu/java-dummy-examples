package com.aandres.learning.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * BookRepository
 * Used by @BookService to return an arraylist of bookings
 *
 * @author Ainoa Andres
 * @see BookRepository
 * @since 1-0.SNAPSHOT
 */
public class BookRepository {

    public List<String> getBookings(){
        return new ArrayList<>(Arrays.asList("Booking 1", "Booking 2", "Booking 3"));
    }
}
