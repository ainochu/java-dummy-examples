package com.aandres.learning.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.Optional;

/**
 * Main bean class
 *
 * @author ainoa andres
 * @see Technology
 */
public class Programmer {

    //Use field DI
    @Autowired
    Technology technology;

    @Value("3")
    private Integer countTechnologies;

    public Programmer(@Qualifier("Java") Technology technology) {
        this.technology = technology;

    }

    public Optional<Integer> getCountTechnologies() {
        System.out.println(countTechnologies);
        return Optional.ofNullable(countTechnologies);
    }

    public Technology getTechnology() {
        return technology;
    }
}
