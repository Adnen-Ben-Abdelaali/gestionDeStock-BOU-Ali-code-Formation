package com.bouali.gestiondestock.exception;

public class EntityNotFoundException extends RuntimeException
{
    private ErrorCodes errorCode;
    
    public EntityNotFoundException(final String message) {
        super(message);
    }
    
    public EntityNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public EntityNotFoundException(final String message, final Throwable cause, final ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }
    
    public EntityNotFoundException(final String message, final ErrorCodes errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    
    public ErrorCodes getErrorCode() {
        return this.errorCode;
    }
}