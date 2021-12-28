package com.bouali.gestiondestock.exception;

import java.util.*;

public class InvalidEntityException extends RuntimeException
{
    private ErrorCodes errorCode;
    private List<String> errors;
    
    public InvalidEntityException(final String message) {
        super(message);
    }
    
    public InvalidEntityException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public InvalidEntityException(final String message, final Throwable cause, final ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }
    
    public InvalidEntityException(final String message, final ErrorCodes errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    
    public InvalidEntityException(final String message, final ErrorCodes errorCode, final List<String> errors) {
        super(message);
        this.errorCode = errorCode;
        this.errors = errors;
    }
    
    public ErrorCodes getErrorCode() {
        return this.errorCode;
    }
    
    public List<String> getErrors() {
        return this.errors;
    }
}