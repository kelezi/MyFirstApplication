package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity(name= "Address")
@Data
@ToString
public class Address {
    @Id
    private Integer addressid;
    @Column
    private String addressline1;
    @Column
    private String addressline2;
    @Column
    private String city;
    @Column
    private Integer stateprovinceid;
    @Column
    private String postalcode;
    @Column
    private String spatiallocation;
    @Column
    private String rowguid;
    @Column
    private LocalDateTime modifieddate;
}
