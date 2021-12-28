package com.bouali.gestiondestock.exception;

public class InvalidOperationException extends RuntimeException
{
    private ErrorCodes errorCode;
    
    public InvalidOperationException(final String message) {
        super(message);
    }
    
    public InvalidOperationException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public InvalidOperationException(final String message, final Throwable cause, final ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }
    
    public InvalidOperationException(final String message, final ErrorCodes errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    
    public ErrorCodes getErrorCode() {
        return this.errorCode;
    }
}