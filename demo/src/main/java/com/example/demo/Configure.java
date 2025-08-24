package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

    @Bean
    public Color getcolor(){
        return new Color();
    }


    
    @Bean
    public Mobiles getOneplusobject(Color getcolor){
        return new Oneplus(getcolor);
    }

    @Bean
    public Mobiles getIphoneobject(Color getcolor){
        return new Iphone(getcolor);
    }
}
