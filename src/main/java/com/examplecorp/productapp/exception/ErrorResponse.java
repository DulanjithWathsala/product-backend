package com.examplecorp.productapp.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@Builder
public class ErrorResponse {

    private HttpStatus status;
    private String message;
}
