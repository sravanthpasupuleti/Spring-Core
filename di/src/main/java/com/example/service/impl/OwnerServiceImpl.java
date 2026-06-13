package com.example.service.impl;

import com.example.repository.OwnerRepository;
import com.example.service.OwnerService;

public class OwnerServiceImpl implements OwnerService{

    private OwnerRepository ownerRepository;
    private int ownerId;

    public OwnerServiceImpl(){
        System.out.println("OwnerServiceImpl default bean has created");
    }


    //Construcor Based Injection
    public OwnerServiceImpl(OwnerRepository ownerRepository, int ownerId){
        this.ownerRepository = ownerRepository;
        this.ownerId = ownerId;
        System.out.println("OwnerServiceImpl Bean has created");
    }

    public void setOwnerRepository(OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }

    public void setOwnerId(int ownerId){
        this.ownerId = ownerId;
    }

    public String findOwner(){
        return ownerRepository.findOwner(ownerId);
    }
    
}
