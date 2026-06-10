package com.example.service.impl;

import com.example.repository.OwnerRepository;
import com.example.service.OwnerService;

public class OwnerServiceImpl implements OwnerService{

    private OwnerRepository ownerRepository;
    private int id;

    public OwnerServiceImpl(OwnerRepository ownerRepository, int id){
        this.ownerRepository = ownerRepository;
        this.id = id;
        System.out.println("OwnerServiceImpl Bean has created");
    }

    public String findOwner(){
        return ownerRepository.findOwner(id);
    }
    
}
