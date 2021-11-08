package com.example.reactbackend.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void shouldFindYuval_usingCustomRepoMethod(){
        assertEquals(1, personRepository.findByFirstNameAndLastName("Yuval", "Harari").size());
    }

    @Test
    void shouldFindYuval_usingQuery(){
        assertEquals(1, personRepository.findByFirstNameAndLastNameUsingQuery
                ("Yuval", "Harari").size());
    }

    @Test
    void shouldFindYuval_usingNativeQuery(){
        assertEquals(1, personRepository.findByFirstNameAndLastNameUsingNativeQuery
                ("Yuval", "Harari").size());
    }

    @Test
    void shouldFindYuval_usingNamedQuery(){
        fail();
    }

    @Test
    void shouldFindYuval_usingNamedNativeQuery(){
        fail();
    }

    @Test
    void shouldFindYuval_usingCustomImplementation(){
        fail();
    }

}