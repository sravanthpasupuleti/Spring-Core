package com.example;

import java.util.List;
import java.util.Scanner;

import com.example.dto.OwnerDTO;
import com.example.dto.PetDTO;
import com.example.service.OwnerService;
import com.example.service.PetService;
import com.example.service.impl.OwnerServiceImpl;
import com.example.service.impl.PetServiceImpl;
import com.example.util.InputUtil;

public class HibernateoneApplication {

	public static void main(String[] args) {
		HibernateoneApplication obj = new HibernateoneApplication();
		obj.run();
	}

	public void run(){
		OwnerService ownerService = new OwnerServiceImpl();
		PetService petService = new PetServiceImpl();
		try(Scanner scanner = new Scanner(System.in)){
			do {
				System.out.println("Welcome to Petistaan");
				int menuOption = InputUtil.acceptMenuOption(scanner);
				switch (menuOption) {
				case 1:
					OwnerDTO ownerDTO = InputUtil.acceptOwnerDetailsToSave(scanner);
					ownerService.saveOwner(ownerDTO);
					System.out.println("Owner has been saved successfully.");
					break;
				case 2:
					int ownerId = InputUtil.acceptOwnerIdToOperate(scanner);
					ownerDTO = ownerService.findOwner(ownerId);
					System.out.println("Owner has been fetched successfully.");
					System.out.println(ownerDTO);
					break;
				case 3:
					ownerId = InputUtil.acceptOwnerIdToOperate(scanner);
					String petName = InputUtil.acceptPetDetailsToUpdate(scanner);
					ownerService.updatePetDetails(ownerId, petName);
					System.out.println("Pet details of owner have been updated successfully.");
					break;
				case 4:
					ownerId = InputUtil.acceptOwnerIdToOperate(scanner);
					ownerService.deleteOwner(ownerId);
					System.out.println("Owner has been deleted successfully.");
					break;
				case 5:
					int petId = InputUtil.acceptPetIdToOperate(scanner);
					PetDTO petDTO = petService.findPet(petId);
					System.out.println("Pet has been fetched successfully.");
					System.out.println(petDTO);
					break;
				default:
					System.out.println("Invalid option entered.");
				}
		}while (InputUtil.wantToContinue(scanner));
	}catch (Exception e) {
			System.out.println(e.getMessage());
	}

}

}
