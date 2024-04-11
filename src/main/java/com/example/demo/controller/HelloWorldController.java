package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Value("${spring.application.name}")
    private String myUser;

    @GetMapping("/world")
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hello World "+ myUser, HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity<String> helloName(@RequestParam String name){
        return new ResponseEntity<>("Hello "+name, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> helloNameAsPathVariable(@PathVariable("name") String name){
        return new ResponseEntity<>("Hello "+name, HttpStatus.OK);
    }

    @GetMapping("/userInfo")
    public ResponseEntity<String> helloUser(@RequestBody UserDTO user){
        return new ResponseEntity<>("Hello "+ user.toString(), HttpStatus.OK);
    }
}
