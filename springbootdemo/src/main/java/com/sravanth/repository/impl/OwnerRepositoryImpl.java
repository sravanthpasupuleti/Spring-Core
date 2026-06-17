package com.sravanth.repository.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.sravanth.repository.OwnerRepository;

@Repository
@Primary
@Scope("prototype")
public class OwnerRepositoryImpl implements OwnerRepository{

    public OwnerRepositoryImpl(){
        System.out.println("OwnerRepositoryImpl Common Bean has created");
    }

    public String findOwner(int id){
        return String.format("Found owner with owner id %s from repo",id);
    }
}
