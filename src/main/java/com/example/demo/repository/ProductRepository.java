package com.example.demo.repository;

import com.example.demo.dto.ProductDetailsDTO;
import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(nativeQuery = true)
    public ProductDetailsDTO getProductDetails(@Param("id") Integer id);
}
