package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDetailsDTO implements Serializable {

    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "price")
    private BigDecimal price;
    @JsonProperty(value = "category")
    private String category;
}
