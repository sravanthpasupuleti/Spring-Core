package com.sravanth;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sravanth.service.OwnerService;

//@SpringBootApplication is combination of @Configuration, @ComponentScan, @EnableAutoConfiguration
@SpringBootApplication
public class SpringbootdemoApplication implements CommandLineRunner{

	@Autowired
	private OwnerService ownerService;

	@Autowired
	private OwnerService ownerService2;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

	@Override
	public void run(String... args){
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Before Updating Id");
			System.out.println(ownerService.findOwner());
			System.out.println(ownerService2.findOwner());
			System.out.println("enter new owner id : ");
			int updateId = sc.nextInt();
			ownerService.modifyId(updateId);
			System.out.println("After Updating Id");
			System.out.println(ownerService.findOwner());
			System.out.println(ownerService2.findOwner());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
