package com.example.demo.service;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

   // @Autowired
    //PersonRepository personRepository;

    public Customer getCustomerById(Integer id){
       // personRepository.getReferenceById(id);
        return  repository.getReferenceById(id);
    }
    public Integer countCustomerOrders(Integer id){
        return repository.countOrders(id);
    }
}
