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

public class MappingApplication {

	public static void main(String[] args) {
		MappingApplication obj = new MappingApplication();
		obj.run();
	}

	public void run() {
		OwnerService ownerService = new OwnerServiceImpl();
		PetService petService = new PetServiceImpl();
		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.println("Welcome to Petistaan");
				int menuOption = InputUtil.acceptMenuOption(scanner);
				switch (menuOption) {
				case 1:
					int ownerId = InputUtil.acceptOwnerIdToOperate(scanner);
					OwnerDTO ownerDTO = ownerService.findOwner(ownerId);
					System.out.println("Owner has been fetched successfully.");
					System.out.println(ownerDTO);
					break;
				case 2:
					int petId = InputUtil.acceptPetIdToOperate(scanner);
					PetDTO petDTO = petService.findPet(petId);
					System.out.println("Pet has been fetched successfully.");
					System.out.println(petDTO);
					break;
				case 3:
					List<OwnerDTO> ownerDTOList = ownerService.findAllOwners();
					System.out.println("There are " + ownerDTOList.size() + " owners.");
					ownerDTOList.forEach(System.out::println);
					System.out.println("----------OwnerWithPet-------------");
					List<OwnerDTO> ownerDTOListWithPet = ownerService.findOwnerWithPet();
					ownerDTOListWithPet.forEach(System.out::println);
					break;
				case 4:
					List<PetDTO> petDTOList = petService.findAllPets();
					System.out.println("There are " + petDTOList.size() + " pets.");
					petDTOList.forEach(System.out::println);
					break;
				default:
					System.out.println("Invalid option entered.");
				}
			} while (InputUtil.wantToContinue(scanner));
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}