package com.example.exception;

public class PetNotFoundException extends Exception{
    public PetNotFoundException(String msg){
        super(msg);
    }
}
