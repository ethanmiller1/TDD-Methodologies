package com.demo.api.controller;

import com.demo.api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/people")
public class PersonController {

    // Instantiate person object.
    private PersonService personService;

    public PersonController(@Autowired PersonService personService) {
        this.personService = personService;
    }

    public Object findAllPersons() {
        return null;
    }

}
