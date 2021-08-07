package com.job.managementapp.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;
    private final LocalDate dateOfBirth;
    private Integer age;

    public Person(String name, LocalDate dateOfBirth) {
        this(UUID.randomUUID(), name, dateOfBirth);
    }

    public Person(UUID id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Integer getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

}
