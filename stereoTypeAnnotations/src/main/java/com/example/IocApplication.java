package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.service.OwnerService;

@Configuration
@ComponentScan
public class IocApplication {
	public static void main(String[] args) {
		System.out.println("Start");

		ApplicationContext context = new AnnotationConfigApplicationContext(IocApplication.class);

		OwnerService ownerService = context.getBean("specialService",OwnerService.class);
		System.out.println(ownerService.findOwner());

		System.out.println("End");
	}

}
