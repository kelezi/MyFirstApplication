package com.example.demo.repository;

import com.example.demo.entities.SalesOrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesORderHeaderRepository extends JpaRepository<SalesOrderHeader, Integer> {
}
