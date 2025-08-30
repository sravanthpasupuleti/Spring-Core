package com.example.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class  OwnerRepositoryimpl implements OwnerRepository{

    public OwnerRepositoryimpl(){
        System.out.println("ownerrepositoryimpl Normal constructor");
    }

    public String findid(int ownerid) {
        return "owner id is " + ownerid;
    }

}
