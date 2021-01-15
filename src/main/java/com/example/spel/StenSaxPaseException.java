package com.example.spel;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class StenSaxPaseException extends RuntimeException{
    public StenSaxPaseException(String exception){
        super(exception);
    }
}
