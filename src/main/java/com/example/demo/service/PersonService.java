package com.example.demo.service;

import com.example.demo.entities.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired// dependency injection
    PersonRepository repository;

    public List<Person> getAllPeople(){
        return  repository.findAll();
    }
}
