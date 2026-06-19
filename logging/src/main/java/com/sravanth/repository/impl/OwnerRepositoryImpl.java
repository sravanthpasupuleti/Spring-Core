package com.sravanth.repository.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.sravanth.exception.OwnerNotFoundException;
import com.sravanth.repository.OwnerRepository;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository{

    @Value("${owner.found}")
    private String Owner_Found;

    public OwnerRepositoryImpl(){
        System.out.println("OwnerRepositoryImpl Common Bean has created");
    }

    public String findOwner(int id) throws OwnerNotFoundException{
        if (id % 2 == 1) {
            throw new OwnerNotFoundException(id);
        }else{
            return String.format(Owner_Found,id);
        }
    }
}
