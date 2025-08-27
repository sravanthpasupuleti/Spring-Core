package com.example.demo.ex2;

public class OwnerServiceimpl implements OwnerService{

    OwnerRepository repo;

    // public OwnerServiceimpl(OwnerRepository repo){
    //     System.out.println("ownerserviceimpl construcotor is exetuted");
    //     this.repo = repo;
    // }

    public OwnerServiceimpl(){
        System.out.println("ownerserviceimpl constructor");
    }

    public void setOwnerservice(OwnerRepository repo){
        this.repo = repo;
    }

    public String Hlo(){
        // System.out.println("OwnerService hlo method");
        return repo.Hi();
    }
}