package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {
    
    @Bean
    public Mobiles getOneplusobject(){
        return new Oneplus();
    }

    @Bean
    public Mobiles getIphoneobject(){
        return new Iphone();
    }
}
