package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.ex2.Configureex;
import com.example.demo.ex2.OwnerService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		// AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);

		// Mobiles obj = context.getBean("getOneplusobject" , Mobiles.class);

		// obj.getModalAndColor();

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configureex.class);

		OwnerService service =(OwnerService) context.getBean("ownerService");

		// service.Hlo();

		System.out.println(service.Hlo());

		((AnnotationConfigApplicationContext) context).close();
	}

}
