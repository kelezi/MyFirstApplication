package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="Customer", schema="Sales")// kur duam te aksesojme 1 tabele
// tjeter qe ndodhet jashte default schema ateher shtojme @Table
// dhe japim emrin e tabeles dhe schemas qe ndodhet
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer {

    @Id
    private Integer customerid;
    @Column
    private Integer storeid;
    @Column
    private Integer territoryid;
    @Column
    private String accountnumber;

    @OneToOne(fetch = FetchType.EAGER)// EAGER=> ti i mer te dhenat njekohesisht
            // LAZY=> nuk i mer te dhenat
    @JoinColumn(name="personid")
    Person person;

    @OneToMany
    @JoinColumn(name="customerid")
    List<SalesOrderHeader> salesOrderHeaders;
}
