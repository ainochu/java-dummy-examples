package com.aandres.learning.service;

import com.aandres.learning.repository.BookRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class BookServiceTest {


    private BookService bookService;

    private BookRepository bookRepository;

    @Before
    public void init(){
        this.bookRepository = Mockito.mock(BookRepository.class);
        this.bookService = new BookService(bookRepository);
    }


    @Test
    public void setBookServiceFull(){
        Mockito.when(bookRepository.getBookings()).thenReturn(new ArrayList<String>());
        Assert.assertEquals(0,bookService.getBookings().size());
    }
}
