package com.examplecorp.productapp.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {

    private Integer id;
    private String name;
    private BigDecimal price;
}
