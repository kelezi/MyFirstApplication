package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.Data;

import java.time.LocalDateTime;

@Entity(name="personphone")
@Data
public class PersonPhone {
    @Id
    private Integer businessentityid;
    @Column
    @Min(5)
    private String phonenumber;
    @Column
    private Integer phonenumbertypeid;
    @Column
    private LocalDateTime modifieddate;
}
