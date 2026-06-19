package com.sravanth.exception;

public class OwnerNotFoundException extends Exception{
    
    public OwnerNotFoundException(int id){
        super("cant find owner with "+id);
    }
}