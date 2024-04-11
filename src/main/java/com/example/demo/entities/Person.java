package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity(name = "Person")
@Data
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Person {

    @Id
    private Integer businessentityid;
    @Column
    @Size(min=0, max=2)
    private String persontype;
    @Column
    private Integer namestyle;
    @Column
    @Size(max=8)
    private String title;
    @Column
    private String firstname;
    @Column
    private String middlename;
    @Column
    private String lastname;
    @Column
    private String suffix;
    @Column
    private Integer emailpromotion;
    @Column
    private LocalDateTime modifieddate;

}
