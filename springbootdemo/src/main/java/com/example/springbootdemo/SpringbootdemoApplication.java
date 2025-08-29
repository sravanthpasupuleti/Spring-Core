package com.example.springbootdemo;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.Config;
import com.example.repository.OwnerRepository;
import com.example.repository.OwnerRepositoryimpl;
import com.example.service.OwnerService;
import com.example.service.OwnerServiceimpl;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringbootdemoApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		OwnerService obj = context.getBean("ownerServiceimpl" , OwnerServiceimpl.class);
		OwnerRepository obj2 = context.getBean("ownerRepositoryimpl" , OwnerRepository.class);
		((OwnerServiceimpl)obj).setrepo(obj2);
		((OwnerServiceimpl)obj).setid(4);
		System.out.println(obj.serviceid());
	}

}
