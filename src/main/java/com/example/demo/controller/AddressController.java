package com.example.demo.controller;

import com.example.demo.entities.Address;
import com.example.demo.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/address")
@Slf4j
public class AddressController {

    //Logger log = Logger.getLogger(AddressController.class.getName());
    @Autowired
    AddressService service;

    @GetMapping("/getAll")
    public ResponseEntity <List<Address>> getAll(){
        long start = System.currentTimeMillis();
        log.info("AddressController.getAll() started");
        List<Address> addresses = service.getAllAddresses();
        log.info("AddressController.getAll() ended in [{}] ms", System.currentTimeMillis()-start);
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }

    @GetMapping("/getById")
    public ResponseEntity<Address> getById(@RequestParam("addressId") Integer addressId){
        long start = System.currentTimeMillis();
        log.info("AddressController.getById() started");
        Address address = service.getAddressById(addressId);
        log.info("AddressController.getById() ended in {} ms", System.currentTimeMillis()-start );
    return new ResponseEntity<>(address, HttpStatus.OK);
    }

}
