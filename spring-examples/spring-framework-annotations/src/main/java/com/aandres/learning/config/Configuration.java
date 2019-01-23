package com.aandres.learning.config;

import com.aandres.learning.bean.Java;
import com.aandres.learning.bean.Programmer;
import com.aandres.learning.bean.Technology;
import org.springframework.context.annotation.Bean;

/**
 * Configuration class
 * Used to create a new instance of Programmer bean + autowired DI.
 *
 * @author ainoa andres
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    Programmer programmer(){
        //When you instance a new spring bean, you must set the technology bean too.
        return new Programmer(technology());
    }

    @Bean("java")
    Technology technology(){
        return new Java();
    }
}
