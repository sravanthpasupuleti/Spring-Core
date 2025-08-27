package com.example.demo.ex2;

public class OwnerRepositoryimpl implements OwnerRepository{

    public OwnerRepositoryimpl(){
        System.out.println("OwnerRepositoryimpl constructor is executed");
    }

    public String Hi(){
        return "Owner repository  hi method";
    }

}
