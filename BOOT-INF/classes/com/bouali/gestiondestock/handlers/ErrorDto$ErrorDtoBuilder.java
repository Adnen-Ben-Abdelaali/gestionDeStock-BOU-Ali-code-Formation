package com.bouali.gestiondestock.handlers;

import com.bouali.gestiondestock.exception.*;
import java.util.*;

public static class ErrorDtoBuilder
{
    private Integer httpCode;
    private ErrorCodes code;
    private String message;
    private List<String> errors;
    
    ErrorDtoBuilder() {
    }
    
    public ErrorDtoBuilder httpCode(final Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    
    public ErrorDtoBuilder code(final ErrorCodes code) {
        this.code = code;
        return this;
    }
    
    public ErrorDtoBuilder message(final String message) {
        this.message = message;
        return this;
    }
    
    public ErrorDtoBuilder errors(final List<String> errors) {
        this.errors = errors;
        return this;
    }
    
    public ErrorDto build() {
        return new ErrorDto(this.httpCode, this.code, this.message, this.errors);
    }
    
    @Override
    public String toString() {
        return invokedynamic(makeConcatWithConstants:(Ljava/lang/Integer;Lcom/bouali/gestiondestock/exception/ErrorCodes;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;, this.httpCode, this.code, this.message, this.errors);
    }
}