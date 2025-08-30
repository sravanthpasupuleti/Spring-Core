package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.repository.OwnerRepository;

@Service("normalservice")
public class OwnerServiceimpl2 implements OwnerService {
    @Autowired
    private OwnerRepository repo;
    @Value("7")
    private int id;

    public OwnerServiceimpl2(){
        System.out.println("OwnerServiceimpl2 Special Construcor execured");
    }

    public String serviceid(){
        return repo.findid(id);
    }
}
