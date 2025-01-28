package com.examplecorp.productapp.service.impl;

import com.examplecorp.productapp.repository.ProductRepository;
import com.examplecorp.productapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
}
