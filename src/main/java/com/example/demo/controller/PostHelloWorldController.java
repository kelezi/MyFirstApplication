package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello2")
public class PostHelloWorldController {

    @Value("${spring.application.name}")
    private String myUser;

    @PostMapping("/world")
    public ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("Hello World "+ myUser, HttpStatus.OK);
    }

    @PostMapping("/name")
    public ResponseEntity<String> helloName(@RequestParam String name){
        return new ResponseEntity<>("Hello "+name, HttpStatus.OK);
    }

    @PostMapping("/{name}")
    public ResponseEntity<String> helloNameAsPathVariable(@PathVariable("name") String name){
        return new ResponseEntity<>("Hello "+name, HttpStatus.OK);
    }

    @PostMapping("/userInfo")
    public ResponseEntity<String> helloUser(@RequestBody UserDTO user){

        return new ResponseEntity<>("Hello "+ user.toString(), HttpStatus.OK);
    }
}
