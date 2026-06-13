package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.SpringConfig;
import com.example.service.OwnerService;

public class IocApplication {

	public static void main(String[] args) {
		System.out.println("Start");

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		OwnerService ownerService = context.getBean("ownerService",OwnerService.class);
		System.out.println(ownerService.findOwner());

		System.out.println("End");
	}

}
