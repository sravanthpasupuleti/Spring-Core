package com.example.exception;

public class InternalServiceException extends RuntimeException{
    public InternalServiceException(String msg){
        super(msg);
    }
}
