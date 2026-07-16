package com.example.exception;

public class OwnerNotFoundException extends Exception{
    public OwnerNotFoundException(String msg){
        super(msg);
    }
}
