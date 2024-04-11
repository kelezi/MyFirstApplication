package com.example.demo.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data// krijojme getters setters dhe no args constructor
@RequiredArgsConstructor
@ToString
public class UserDTO {

    private String name;
    private String surname;
    private int age;
    private String role;
}
