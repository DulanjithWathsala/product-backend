package com.examplecorp.productapp.enums;

import lombok.Getter;

@Getter
public enum ResponseCode {

    PRODUCT_NOT_FOUND("Requested product is not found");

    private final String message;

    ResponseCode(String message) {
        this.message = message;
    }
}
