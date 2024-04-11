package com.example.demo.controller;

import com.example.demo.entities.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping("/getById/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id){

        Customer customer = service.getCustomerById(id);

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping("/count/{id}")
    public ResponseEntity<Integer> countOrdersByCustomerId(@PathVariable Integer id){

        Integer count = service.countCustomerOrders(id);

        return new ResponseEntity<>(count, HttpStatus.OK);
    }
}
