package com.example.demo.controller;

import com.example.demo.dto.ProductDetailsDTO;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/getDetails")
    public ResponseEntity<ProductDetailsDTO> getProductDetails(@Validated @RequestParam Integer id){

        ProductDetailsDTO details = service.getProductDetails(id);
        return new ResponseEntity<>(details, HttpStatus.OK);
    }
}
