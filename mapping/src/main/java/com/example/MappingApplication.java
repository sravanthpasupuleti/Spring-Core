package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.dto.OwnerDTO;
import com.example.dto.PetDTO;
import com.example.service.OwnerService;
import com.example.service.PetService;
import com.example.service.impl.OwnerServiceImpl;
import com.example.service.impl.PetServiceImpl;
import com.example.util.InputUtil;

public class MappingApplication {

	public static void main(String[] args) {
		MappingApplication obj = new MappingApplication();
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
					PetDTO petDTO = InputUtil.acceptPetDetailsToSave(scanner);
					List<PetDTO> petDTOList = new ArrayList<>();
					petDTOList.add(petDTO);
					ownerDTO.setPetDTOList(petDTOList);
					ownerService.saveOwner(ownerDTO);
					System.out.println("Owner has been saved successfully.");
					break;
				case 2:
					int ownerId = InputUtil.acceptOwnerIdToOperate(scanner);
					ownerDTO = ownerService.findOwner(ownerId);
					System.out.println("Owner has been fetched successfully.");
					System.out.println(ownerDTO);
					OwnerDTO ownerDTO2 = ownerService.findOwnerWithPet(ownerId);
					System.out.println("Owner With Pet has been fetched successfully.");
					System.out.println(ownerDTO2);
					break;
				case 3:
					ownerId = InputUtil.acceptOwnerIdToOperate(scanner);
					int petId = InputUtil.acceptPetIdToOperate(scanner);
					String petName = InputUtil.acceptPetDetailsToUpdate(scanner);
					ownerService.updatePetDetails(ownerId, petId, petName);
					System.out.println("Pet details of owner have been updated successfully.");
					break;
				case 4:
					ownerId = InputUtil.acceptOwnerIdToOperate(scanner);
					ownerService.deleteOwner(ownerId);
					System.out.println("Owner has been deleted successfully.");
					break;
				case 5:
					petId = InputUtil.acceptPetIdToOperate(scanner);
					petDTO = petService.findPet(petId);
					System.out.println("Pet has been fetched successfully.");
					System.out.println(petDTO);
					break;
				case 6:
					ownerId = InputUtil.acceptOwnerIdToOperate(scanner);
					petDTO = InputUtil.acceptPetDetailsToSave(scanner);
					ownerService.savePet(ownerId, petDTO);
					System.out.println("Pet has been saved successfully");
					break;
				case 7:
					petId = InputUtil.acceptPetIdToOperate(scanner);
					petService.deletePet(petId);
					System.out.println("Pet has been deleted successfully");
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
