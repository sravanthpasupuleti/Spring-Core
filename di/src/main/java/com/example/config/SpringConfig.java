package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.repository.OwnerRepository;
import com.example.repository.impl.OwnerRepositoryImpl;
import com.example.service.OwnerService;
import com.example.service.impl.OwnerServiceImpl;

@Configuration
public class SpringConfig {

    @Bean
    public OwnerService ownerService(){
        OwnerServiceImpl ownerServiceImpl = new OwnerServiceImpl();
        ownerServiceImpl.setOwnerRepository(ownerRepository());
        ownerServiceImpl.setOwnerId(7);
        return ownerServiceImpl;
    }

    
    //construcor based injection
    // @Bean
    // public OwnerService ownerService(){
    //     return new OwnerServiceImpl(new OwnerRepositoryImpl(), 7);
    // }

    @Bean
    public OwnerRepository ownerRepository(){
        return new OwnerRepositoryImpl();
    }

}
