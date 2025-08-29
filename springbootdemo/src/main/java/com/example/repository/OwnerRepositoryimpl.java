package com.example.repository;

import org.springframework.stereotype.Component;

@Component
public class  OwnerRepositoryimpl implements OwnerRepository{

    public OwnerRepositoryimpl(){
        System.out.println("ownerrepositoryimpl constructor");
    }

    public String findid(int ownerid) {
        // System.out.println("owner id is" + ownerid);
        return "owner id is" + ownerid;
    }

}
