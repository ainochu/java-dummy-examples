package com.aandres.learning.service;


import com.aandres.learning.bean.Programmer;

import java.util.Optional;

/**
 * Service layer logic
 *
 * @author ainoa andres
 * @see Programmer
 */
public class ProgramServiceImpl implements ProgramService {
    
    @Override
    public Integer countProgramTechnologies(Optional<Programmer> programmer) {
        return programmer.flatMap(Programmer::getCountTechnologies).orElse(0);
    }
}
