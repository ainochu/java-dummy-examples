package com.aandres.learning;

import com.aandres.learning.bean.Programmer;
import com.aandres.learning.config.Configuration;
import com.aandres.learning.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;


/**
 * Main app
 * Uses the ApplicationContext to load all of bean inside the app.
 *
 * @author ainoa andres
 * @see ApplicationContext
 * @see Configuration
 */
public class App {

    @Autowired
    static ProgramService programService;

    public static void main(String[] args) {

        instanceProgrammer();
    }

    private static void instanceProgrammer() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Programmer programmer = context.getBean("programmer", Programmer.class);
        //Do the programmer instance as nullable
        Optional<Programmer> programmer1 = Optional.ofNullable(programmer);

        programService.countProgramTechnologies(programmer1);
    }
}