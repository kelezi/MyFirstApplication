package com.example.demo.repository;

import com.example.demo.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


    @Query(nativeQuery = true, value = "select count(s.customerid) " +
            "from sales.customer c join sales.salesorderheader s " +
            "on s.customerid = c.customerid" +
            " where c.customerid = :id")
    public Integer countOrders(@Param("id") Integer id);

}
