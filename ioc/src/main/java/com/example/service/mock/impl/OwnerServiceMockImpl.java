package com.example.service.mock.impl;

import com.example.service.OwnerService;

public class OwnerServiceMockImpl implements OwnerService{

    private int id;

    public OwnerServiceMockImpl(int id){
        this.id = id;
        System.out.println("OwnerServiceImpl Mock bean has created");
    }
    
    public String findOwner(){
        return String.format("found woner with id %s", id);
    }
}
