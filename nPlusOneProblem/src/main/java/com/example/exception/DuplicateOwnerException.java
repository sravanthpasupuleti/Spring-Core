package com.example.exception;

public class DuplicateOwnerException extends Exception{
    public DuplicateOwnerException(String msg){
        super(msg);
    }
}
