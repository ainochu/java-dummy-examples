package com.aandres.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.aandres.learning.repository.BookRepository;

import java.util.List;

/**
 * BookService
 * Basic example of constructor injection
 *
 * @author Ainoa Andres
 * @see BookRepository
 * @since 1-0.SNAPSHOT
 */
public class BookService {

    /**Dependency injection to include the bean class into the constructor
     * It's necessary to use the @Component in each bean class. Otherwise, you'll need to create the XML file for each class.
     */
    @Autowired
    private BookRepository bookRepository;

    /**
     * Constructor-arg used to inject dependencies and values as object properties. You can't have two or more constructors in the bean definition.
     */
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<String> getBookings(){
        return this.bookRepository.getBookings();
    }
}
