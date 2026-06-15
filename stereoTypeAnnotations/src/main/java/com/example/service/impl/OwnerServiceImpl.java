package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.repository.OwnerRepository;
import com.example.service.OwnerService;

@Service("normalService")
public class OwnerServiceImpl implements OwnerService{

    //property-based auto wiring
    @Autowired
    private OwnerRepository ownerRepository;
    @Value("10")
    private int ownerId;

    public OwnerServiceImpl(){
        System.out.println("OwnerServiceImpl normal bean has created");
    }


    //Construcor Based Injection
    //@Autowired
    // public OwnerServiceImpl(OwnerRepository ownerRepository,@Value("7") int ownerId){
    //     this.ownerRepository = ownerRepository;
    //     this.ownerId = ownerId;
    //     System.out.println("OwnerServiceImpl Bean has created");
    // }

    //Setter Based AutoWired Injection
    // @Autowired
    // public void setOwnerRepository(OwnerRepository ownerRepository){
    //     System.out.println("service setter method");
    //     this.ownerRepository = ownerRepository;
    // }

    // @Value("17")
    // public void setOwnerId(int ownerId){
    //     this.ownerId = ownerId;
    // }

    public String findOwner(){
        return ownerRepository.findOwner(ownerId);
    }
    
}
