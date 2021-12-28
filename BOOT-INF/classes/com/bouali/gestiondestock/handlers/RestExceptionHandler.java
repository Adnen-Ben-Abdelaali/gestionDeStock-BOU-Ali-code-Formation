package com.bouali.gestiondestock.handlers;

import org.springframework.web.servlet.mvc.method.annotation.*;
import org.springframework.web.context.request.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.authentication.*;
import com.bouali.gestiondestock.exception.*;
import java.util.*;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler
{
    @ExceptionHandler({ EntityNotFoundException.class })
    public ResponseEntity<ErrorDto> handleException(final EntityNotFoundException exception, final WebRequest webRequest) {
        final HttpStatus notFound = HttpStatus.NOT_FOUND;
        final ErrorDto errorDto = ErrorDto.builder().code(exception.getErrorCode()).httpCode(notFound.value()).message(exception.getMessage()).build();
        return (ResponseEntity<ErrorDto>)new ResponseEntity((Object)errorDto, notFound);
    }
    
    @ExceptionHandler({ InvalidOperationException.class })
    public ResponseEntity<ErrorDto> handleException(final InvalidOperationException exception, final WebRequest webRequest) {
        final HttpStatus notFound = HttpStatus.BAD_REQUEST;
        final ErrorDto errorDto = ErrorDto.builder().code(exception.getErrorCode()).httpCode(notFound.value()).message(exception.getMessage()).build();
        return (ResponseEntity<ErrorDto>)new ResponseEntity((Object)errorDto, notFound);
    }
    
    @ExceptionHandler({ InvalidEntityException.class })
    public ResponseEntity<ErrorDto> handleException(final InvalidEntityException exception, final WebRequest webRequest) {
        final HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        final ErrorDto errorDto = ErrorDto.builder().code(exception.getErrorCode()).httpCode(badRequest.value()).message(exception.getMessage()).errors(exception.getErrors()).build();
        return (ResponseEntity<ErrorDto>)new ResponseEntity((Object)errorDto, badRequest);
    }
    
    @ExceptionHandler({ BadCredentialsException.class })
    public ResponseEntity<ErrorDto> handleException(final BadCredentialsException exception, final WebRequest webRequest) {
        final HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        final ErrorDto errorDto = ErrorDto.builder().code(ErrorCodes.BAD_CREDENTIALS).httpCode(badRequest.value()).message(exception.getMessage()).errors(Collections.singletonList("Login et / ou mot de passe incorrecte")).build();
        return (ResponseEntity<ErrorDto>)new ResponseEntity((Object)errorDto, badRequest);
    }
}