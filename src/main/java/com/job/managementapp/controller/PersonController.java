package com.job.managementapp.controller;

import com.job.managementapp.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping(path = "/management/v1/person")
public class PersonController {

    @GetMapping(value = "/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAllPerson() {
        List<Person> people = List.of(new Person("John", LocalDate.of(1980, Month.DECEMBER, 20)));
        return new ResponseEntity<>(people, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Integer id, @RequestBody Person person) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Person> deletePerson(@PathVariable Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
