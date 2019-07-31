package com.demo.api.service;

import com.demo.api.model.Person;
import com.demo.api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonService {
    // Instantiate empty person object.
    private PersonRepository personRepository;

    // Assign incoming person object to class attribute.
    public PersonService(@Autowired PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAllPeople() {
        // findAll() is a JPA method.
        return personRepository.findAll();
    }
}