package com.seki.springdb.controllers;

import com.seki.springdb.entities.Person;
import com.seki.springdb.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping(path="/add")
    public @ResponseBody Person addNewPerson(@RequestParam String firstname
    , @RequestParam String lastname) {
        Person newPerson = new Person();
        newPerson.setFirstname(firstname);
        newPerson.setLastname(lastname);
        return personRepository.save(newPerson);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
