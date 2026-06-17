package com.sravanth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.sravanth.repository.OwnerRepository;
import com.sravanth.service.OwnerService;

// @Scope("prototype")
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

    public void modifyId(int ownerId){
        this.ownerId = ownerId;
    }


    public String findOwner(){
        return ownerRepository.findOwner(ownerId);
    }
    
}
