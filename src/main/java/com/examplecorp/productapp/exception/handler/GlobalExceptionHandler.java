package com.examplecorp.productapp.exception.handler;

import com.examplecorp.productapp.exception.ErrorResponse;
import com.examplecorp.productapp.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleProductNotFoundException(
            ProductNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ErrorResponse.builder()
                        .status(HttpStatus.BAD_REQUEST).message(ex.getMessage()).build());
    }
}
