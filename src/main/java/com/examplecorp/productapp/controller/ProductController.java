package com.examplecorp.productapp.controller;

import com.examplecorp.productapp.dto.ProductDto;
import com.examplecorp.productapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/all-by")
    public ResponseEntity<List<ProductDto>> retrieveAll(@RequestParam(defaultValue = "0") Integer pageNumber,
                                                        @RequestParam(defaultValue = "10") Integer pageSize) {
        return productService.retrieveAll(pageNumber, pageSize);
    }

    @GetMapping("/by-id/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Integer id) {
        return productService.getProductById(id);
    }
}
