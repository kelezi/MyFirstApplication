package com.example.demo.controller;

import com.example.demo.entities.PersonPhone;
import com.example.demo.service.PersonPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/personphone")
public class PersonPhoneController {
    @Autowired
    PersonPhoneService service;

    @GetMapping("/getAllById")
    public ResponseEntity<List<PersonPhone>> getAllById(@RequestParam Integer id){
       List<PersonPhone> list = service.getAllPersonPhone(id);
        return new ResponseEntity<>(list , HttpStatus.OK);
    }

    @PostMapping("/savePhone")
    public ResponseEntity<String> savePhone(@Validated @RequestBody PersonPhone personPhone){

        personPhone.setModifieddate(LocalDateTime.now());
        service.savePersonPhone(personPhone);

        return new ResponseEntity<>("Person phone saved successfully", HttpStatus.CREATED);
    }

    @PutMapping("/updatePhone")
    public ResponseEntity<String> updatePhone(@RequestBody PersonPhone personPhone){
        personPhone.setModifieddate(LocalDateTime.now());
        service.updatePersonPhone(personPhone);
        return new ResponseEntity<>("Person phone updated successfully", HttpStatus.OK);
    }
}
