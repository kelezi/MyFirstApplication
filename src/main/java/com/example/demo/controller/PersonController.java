package com.example.demo.controller;

import com.example.demo.entities.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService service;

    @GetMapping("/getAll")
    public ResponseEntity<List<Person>> getAllPeople(){
        List<Person> people = service.getAllPeople();
        return new ResponseEntity<>(people, HttpStatus.OK);
    }
}
