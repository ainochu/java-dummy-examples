package com.aandres.learning.service;

import com.aandres.learning.bean.Programmer;

import java.util.Optional;

/**
 * Service layer
 *
 * @author ainoa andres
 * @see Programmer
 */
public interface ProgramService {

    Integer countProgramTechnologies(Optional<Programmer> programmer);
}
