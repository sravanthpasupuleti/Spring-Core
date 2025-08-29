package com.example.service;

import org.springframework.stereotype.Component;

import com.example.repository.OwnerRepository;

@Component
public class OwnerServiceimpl implements OwnerService{

    private OwnerRepository repo;
    private int id;

    public void setrepo(OwnerRepository repo){
        this.repo = repo;
    }

    public void setid(int id){
        this.id = id;
    }

    public OwnerServiceimpl(){
        System.out.println("OwnerService constructor executed");
    }

    public String serviceid(){
        return repo.findid(id);
    }
}
