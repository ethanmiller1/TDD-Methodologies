package com.demo.api.controller;

import com.demo.api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    // Instantiate person object.
    private PersonService personService;

    public PersonController(@Autowired PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/people")
    public ResponseEntity<?> findAllPersons() {
        return new ResponseEntity<>(personService.findAllPeople(), HttpStatus.OK);
    }

}
