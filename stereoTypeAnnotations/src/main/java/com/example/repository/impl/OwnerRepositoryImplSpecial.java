package com.example.repository.impl;

import org.springframework.stereotype.Repository;

import com.example.repository.OwnerRepository;

@Repository
public class OwnerRepositoryImplSpecial implements OwnerRepository{

    public OwnerRepositoryImplSpecial(){
        System.out.println("OwnerRepositoryImplSpecial bean has created");
    }

    public String findOwner(int ownerId){
        return String.format("Found owner with owner_id from special repo %s", ownerId);
    }

}
