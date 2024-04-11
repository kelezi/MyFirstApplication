package com.example.demo.service;

import com.example.demo.entities.Address;
import com.example.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository repository;

    public List<Address> getAllAddresses(){
        return  repository.findAll();
    }

    public Address getAddressById(Integer addressId){
        return  repository.getAddress(addressId);
    }
}
