package com.sravanth;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import com.sravanth.service.OwnerService;

//@SpringBootApplication is combination of @Configuration, @ComponentScan, @EnableAutoConfiguration
@SpringBootApplication
@PropertySource("messages.properties")
public class SpringbootdemoApplication implements CommandLineRunner{

	@Autowired
	private OwnerService ownerService;

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootdemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

	@Override
	public void run(String... args){
		try(Scanner sc = new Scanner(System.in)){
			LOGGER.info("Execution has Started");
			LOGGER.info(ownerService.findOwner());
			System.out.println("enter new owner id : ");
			int updateId = sc.nextInt();
			ownerService.modifyId(updateId);
			LOGGER.info(ownerService.findOwner());
			LOGGER.info("Excecution Ended");
		}catch (Exception e) {
			LOGGER.error(e.getMessage());
			LOGGER.info("Execution Ended");
		}
	}

}
