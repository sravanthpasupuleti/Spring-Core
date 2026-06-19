package com.sravanth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sravanth.exception.OwnerNotFoundException;
import com.sravanth.repository.OwnerRepository;
import com.sravanth.service.OwnerService;

@Service("normalService")
public class OwnerServiceImpl implements OwnerService{

    //property-based auto wiring
    @Autowired
    private OwnerRepository ownerRepository;
    

    @Value("${owner.id}")
    private int ownerId;

    public OwnerServiceImpl(){
        System.out.println("OwnerServiceImpl normal bean has created");
    }

    public void modifyId(int ownerId){
        this.ownerId = ownerId;
    }


    public String findOwner() throws OwnerNotFoundException{
        return ownerRepository.findOwner(ownerId);
    }
    
}
