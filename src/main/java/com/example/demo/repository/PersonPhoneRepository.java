package com.example.demo.repository;

import com.example.demo.entities.PersonPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PersonPhoneRepository extends JpaRepository<PersonPhone, Integer> { //name of entity + type of pk
    @Query(nativeQuery = true, value= "select * from Person.PersonPhone where businessentityid= :businessentityid")
    public List<PersonPhone> getPersonPhone(Integer businessentityid);

    @Modifying
    @Query(nativeQuery = true,value = "update Person.PersonPhone" +
            " set phoneNumber= :phoneNumber, phoneNumberTypeId = :typeId, " +
            " modifiedDate = :modifiedDate where businessEntityId = :id")
    public void updatePhoneById(String phoneNumber, Integer typeId, LocalDateTime modifiedDate, Integer id);
}
