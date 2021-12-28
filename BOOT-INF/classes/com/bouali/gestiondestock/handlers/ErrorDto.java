package com.bouali.gestiondestock.handlers;

import com.bouali.gestiondestock.exception.*;
import java.util.*;

public class ErrorDto
{
    private Integer httpCode;
    private ErrorCodes code;
    private String message;
    private List<String> errors;
    
    public static ErrorDtoBuilder builder() {
        return new ErrorDtoBuilder();
    }
    
    public Integer getHttpCode() {
        return this.httpCode;
    }
    
    public ErrorCodes getCode() {
        return this.code;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public List<String> getErrors() {
        return this.errors;
    }
    
    public void setHttpCode(final Integer httpCode) {
        this.httpCode = httpCode;
    }
    
    public void setCode(final ErrorCodes code) {
        this.code = code;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    public void setErrors(final List<String> errors) {
        this.errors = errors;
    }
    
    public ErrorDto(final Integer httpCode, final ErrorCodes code, final String message, final List<String> errors) {
        this.errors = new ArrayList<String>();
        this.httpCode = httpCode;
        this.code = code;
        this.message = message;
        this.errors = errors;
    }
    
    public ErrorDto() {
        this.errors = new ArrayList<String>();
    }
    
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
}