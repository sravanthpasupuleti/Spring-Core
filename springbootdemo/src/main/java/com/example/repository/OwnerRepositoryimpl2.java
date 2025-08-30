package com.example.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("normalservice")
public class  OwnerRepositoryimpl2 implements OwnerRepository{

    public OwnerRepositoryimpl2(){
        System.out.println("ownerrepositoryimpl special constructor");
    }

    public String findid(int ownerid) {
        return "owner id is " + ownerid;
    }

}