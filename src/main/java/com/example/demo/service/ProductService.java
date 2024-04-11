package com.example.demo.service;

import com.example.demo.dto.ProductDetailsDTO;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    public ProductDetailsDTO getProductDetails(Integer id){
        return repository.getProductDetails(id);
    }
}
