package com.example.reactbackend.repository;

import com.example.reactbackend.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByFirstNameAndLastName(String firstName, String lastName);

    @Query("SELECT p FROM Person p WHERE p.firstName = :name AND p.lastName = :surname")
    List<Person> findByFirstNameAndLastNameUsingQuery(String name, String surname);
}
