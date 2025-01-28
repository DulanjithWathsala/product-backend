package com.examplecorp.productapp.controller;

import com.examplecorp.productapp.dto.ProductDto;
import com.examplecorp.productapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/all-by/page/{pageNumber}/size/{pageSize}")
    public ResponseEntity<List<ProductDto>> retrieveAll(@PathVariable Integer pageNumber,
                                                        @PathVariable Integer pageSize) {
        return productService.retrieveAll(pageNumber, pageSize);
    }
}
