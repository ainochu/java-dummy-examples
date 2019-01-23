package com.aandres.learning.service;

import com.aandres.learning.bean.Java;
import com.aandres.learning.bean.Programmer;
import com.aandres.learning.bean.Technology;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Optional;

public class ProgramServiceTest {

    private ProgramServiceImpl programService;

    @Autowired
    @Qualifier("Java")
    private Technology technology;

    @Mock
    private ApplicationContext context;


    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        programService = new ProgramServiceImpl();
    }

    @Test
    public void givenZeroCountProgramTechnologies(){
        Programmer nullProgrammer = null;
        Optional<Programmer> programmer = Optional.ofNullable(nullProgrammer);
        Integer totalCount = programService.countProgramTechnologies(programmer);
        Assert.assertEquals(Optional.empty(),programmer);
        Assert.assertEquals(0, totalCount.intValue());
    }

    @Test
    public void givenSucessCountProgramTechnologies(){
        Technology technology = new Java();
        Programmer javaProgrammer = new Programmer(technology);

        //Use JavaReflection to set the new Integer(3) field with a private signature
        Field countField = ReflectionUtils.findField(javaProgrammer.getClass(),"countTechnologies");
        countField.setAccessible(true);
        ReflectionUtils.setField(countField,javaProgrammer,new Integer(3));
        Mockito.doReturn(javaProgrammer).when(context).getBean("programmer",Programmer.class);

        Programmer programmer = context.getBean("programmer", Programmer.class);
        Optional<Programmer> optionalProgrammer = Optional.ofNullable(programmer);
        Integer totalCount = programService.countProgramTechnologies(optionalProgrammer);
        Assert.assertEquals(Optional.of(javaProgrammer),optionalProgrammer);
        Assert.assertTrue(programmer.getTechnology() instanceof Java);
        Assert.assertEquals(3, totalCount.intValue());
    }

}
