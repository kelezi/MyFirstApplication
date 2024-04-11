package com.example.demo.repository;

import com.example.demo.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
//                                                                       kolona ne db || inputi i metodes
    @Query(nativeQuery = true, value = "Select * from Person.Address where addressid = :addressId")
    public Address getAddress(Integer addressId);

}
