package com.demo.api.service;

import com.demo.api.model.Person;
import com.demo.api.repository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class PersonServiceTest {
    private PersonService personService;

    @Mock
    private PersonRepository personRepository;

    Person person1;
    // Set variables to pass into Person.
    Integer id = 1;
    String name = "Ethan";
    Integer age = 23;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        personService = new PersonService(personRepository);
        person1 = new Person(id, name, age);
    }


    @Test
    public void testFindAllPeople() {
        assertNotNull(personService.findAllPeople());
    }
}