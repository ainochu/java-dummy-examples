package com.aandres.learning;

import com.aandres.learning.configuration.ConfigFile;
import com.aandres.learning.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Main app
 * Uses the ApplicationContext to load all of bean inside the app.
 * @see ApplicationContext
 * @see ConfigFile
 *
 * @author ainoa andres
 */
public class App{

    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
        //Use getBean() method to talk with the ApplicationContext container and return the bean object
        BookService bookService = context.getBean("bookService",BookService.class);
        bookService.getBookings();
    }
}