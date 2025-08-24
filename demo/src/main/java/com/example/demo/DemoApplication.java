package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);

		Mobiles obj = context.getBean("getOneplusobject",Mobiles.class);

		obj.getModalAndColor();

		// context.close();
	}

}
