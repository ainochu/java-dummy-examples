package com.aandres.learning.configuration;


import com.aandres.learning.repository.BookRepository;
import com.aandres.learning.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class
 * Uses the @Bean annotation to inject the dependencies into the SpringContext container
 * @see BookService
 *
 * @author ainoa andres
 */
@Configuration
public class ConfigFile {

    @Bean
    public BookService bookService(){
        //Returns a new instance of Booking
        return new BookService(bookRepository());
    }

    @Bean
    public BookRepository bookRepository(){
        return new BookRepository();
    }
}
