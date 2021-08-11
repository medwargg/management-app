package com.job.managementapp.service;

import com.job.managementapp.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonService {

    List<Person> getAll();

    Person get(UUID id);

    Person add(Person person);

    Person update(UUID id, Person person);

    void delete(UUID id);

}
