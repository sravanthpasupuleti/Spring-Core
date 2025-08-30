package com.example.springbootdemo;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// import com.example.config.Config;
import com.example.service.OwnerService;

@SpringBootApplication
@ComponentScan("com.example")
@Configuration
public class SpringbootdemoApplication {

	public static void main(String[] args) {

		// SpringApplication.run(SpringbootdemoApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringbootdemoApplication.class);
		OwnerService obj = context.getBean("normalservice" , OwnerService.class);
		//OwnerRepository obj2 = context.getBean("ownerRepositoryimpl" , OwnerRepository.class);
		// ((OwnerServiceimpl)obj).setrepo(obj2);
		// ((OwnerServiceimpl)obj).setid(4);
		System.out.println(obj.serviceid());
		// (ApplicationConfigApplicationContext(conext)).close();
	}

}
