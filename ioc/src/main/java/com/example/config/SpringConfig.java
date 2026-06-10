package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.repository.OwnerRepository;
import com.example.repository.impl.OwnerRepositoryImpl;
import com.example.service.OwnerService;
import com.example.service.impl.OwnerServiceImpl;
import com.example.service.mock.impl.OwnerServiceMockImpl;

@Configuration
public class SpringConfig {

    @Bean
    public OwnerService ownerServiceMock(){
        return new OwnerServiceMockImpl(0);
    }


    @Bean
    public OwnerService ownerService(){
        return new OwnerServiceImpl(owmRepository(), 0);
    }

    @Bean
    public OwnerRepository owmRepository(){
        return new OwnerRepositoryImpl();
    }

}
