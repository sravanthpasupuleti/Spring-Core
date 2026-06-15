package com.example.repository.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.example.repository.OwnerRepository;

@Repository
@Primary
public class OwnerRepositoryImpl implements OwnerRepository{

    public OwnerRepositoryImpl(){
        System.out.println("OwnerRepositoryImpl Common Bean has created");
    }

    public String findOwner(int id){
        return String.format("Found owner with owner id %s from normal repo",id);
    }
}
