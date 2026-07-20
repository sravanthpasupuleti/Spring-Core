package com.example.exception;

public class DuplicatePetException extends Exception{
    public DuplicatePetException(String msg){
        super(msg);
    }
}
