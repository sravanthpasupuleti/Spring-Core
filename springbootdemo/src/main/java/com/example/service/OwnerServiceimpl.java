package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.repository.OwnerRepository;

@Service
public class OwnerServiceimpl implements OwnerService{

    private OwnerRepository repo;
    private int id;

    
    public OwnerServiceimpl(@Autowired OwnerRepository repo ,@Value("4") int id){
        this.repo = repo;
        this.id = id;
        System.out.println("OwnerServiceimpl Normal constructor executed");
    }

    // @Autowired
    // public void setrepo(OwnerRepository repo){
    //     this.repo = repo;
    // }

    // @Value("7")
    // public void setid(int id){
    //     this.id = id;
    // }

    public String serviceid(){
        return repo.findid(id);
    }
}