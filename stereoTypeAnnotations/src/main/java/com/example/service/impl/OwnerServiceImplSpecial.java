package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.repository.OwnerRepository;
import com.example.service.OwnerService;

@Service("specialService")
public class OwnerServiceImplSpecial implements OwnerService{

    @Autowired
    @Qualifier("ownerRepositoryImplSpecial")  //this annotrations helpu us to inject a specific bean out of multiple beans of same data type
    private OwnerRepository ownerRepository;

    @Value("100")
    private int ownerId;

    public OwnerServiceImplSpecial(){
        System.out.println("OwnerServiceImplSpecial bean has creted");
    }

    @Override
    public String findOwner(){
        return ownerRepository.findOwner(ownerId);
    }
}
