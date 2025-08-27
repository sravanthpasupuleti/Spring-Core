package com.example.demo.ex2;

import com.example.demo.ex2.OwnerServiceimpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configureex {


    //Constructor injection
    // @Bean
    // public OwnerService ownerService(){
    //     return new OwnerServiceimpl(ownerRepository());
    // }

    // @Bean
    // public OwnerRepository ownerRepository(){
    //     return new OwnerRepositoryimpl();
    // }

    //setter based injection

    @Bean
    public OwnerService ownerService(){
        OwnerService service = new OwnerServiceimpl();
        service.setOwnerservice(ownerRepository());
        return service;
    }

    @Bean
    public OwnerRepository ownerRepository(){
        return new OwnerRepositoryimpl();
    }
}
