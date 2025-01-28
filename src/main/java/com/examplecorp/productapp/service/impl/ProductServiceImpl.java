package com.examplecorp.productapp.service.impl;

import com.examplecorp.productapp.dto.ProductDto;
import com.examplecorp.productapp.entity.Product;
import com.examplecorp.productapp.enums.ResponseCode;
import com.examplecorp.productapp.exception.ProductNotFoundException;
import com.examplecorp.productapp.repository.ProductRepository;
import com.examplecorp.productapp.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ObjectMapper objectMapper;

    @Override
    public ResponseEntity<List<ProductDto>> retrieveAll(Integer pageNumber, Integer pageSize) {
        return ResponseEntity.ok(
                productRepository.findAll(PageRequest.of(pageNumber, pageSize))
                        .getContent()
                        .stream()
                        .map(product -> objectMapper.convertValue(product, ProductDto.class))
                        .toList());
    }

    @Override
    public ResponseEntity<ProductDto> getProductById(Integer id) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new ProductNotFoundException(ResponseCode.PRODUCT_NOT_FOUND.getMessage()));

        return ResponseEntity.ok(objectMapper.convertValue(product, ProductDto.class));
    }
}
