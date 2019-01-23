package com.aandres.learning.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Java class
 * In case that you have multiple instances of Technology to be instance as @Autowired, @Primary set preference to Java like the rest of classes.
 *
 * @author ainoa andres
 */
@Component
@Primary
public class Java implements Technology {
}
