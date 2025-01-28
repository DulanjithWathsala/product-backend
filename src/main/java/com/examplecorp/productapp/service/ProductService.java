package com.examplecorp.productapp.service;

import com.examplecorp.productapp.dto.ProductDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    ResponseEntity<List<ProductDto>> retrieveAll(Integer pageNumber, Integer pageSize);
}
