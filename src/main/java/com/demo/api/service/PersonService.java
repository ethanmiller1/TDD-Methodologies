package com.demo.api.service;

import com.demo.api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {
    // Instantiate empty person object.
    private PersonRepository personRepository;

    // Assign incoming person object to class attribute.
    public PersonService(@Autowired PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}