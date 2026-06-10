package com.example.repository.impl;

import com.example.repository.OwnerRepository;

public class OwnerRepositoryImpl implements OwnerRepository{

    public OwnerRepositoryImpl(){
        System.out.println("OwnerRepositoryImpl has created");
    }

    public String findOwner(int id){
        return String.format("Found owner with owner id %s from repo",id);
    }
}
