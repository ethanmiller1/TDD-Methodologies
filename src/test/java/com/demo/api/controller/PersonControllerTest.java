package com.demo.api.controller;

import com.demo.api.model.Person;
import com.demo.api.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class PersonControllerTest {
    private PersonController personController;

    @Mock
    private PersonService personService;

    Person person1;
    Integer id = 1;
    String name = "Ethan";
    Integer age = 23;


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        // Copy mock Person attributes to PersonController
        personController = new PersonController(personService);
        person1 = new Person(id, name, age);
    }

    @Test
    public void testFindAllPersons() {
        assertNotNull(personController.findAllPersons());
    }
}