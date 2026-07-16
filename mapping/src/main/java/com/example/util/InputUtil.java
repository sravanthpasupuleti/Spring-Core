package com.example.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

import com.example.dto.OwnerDTO;
import com.example.dto.PetDTO;
import com.example.enums.Gender;
import com.example.enums.PetType;

public class InputUtil {
    private InputUtil(){

    }

    public static int acceptMenuOption(Scanner scanner){
        System.out.println("Press 1 to add new owner.");
		System.out.println("Press 2 to fetch owner details.");
		System.out.println("Press 3 to update pet details of owner.");
		System.out.println("Press 4 to delete owner details.");
		System.out.println("Press 5 to fetch pet details.");
		System.out.println("press 6 to add a new pet");
		System.out.println("press 7 to delete pet details");
        int menuOption = scanner.nextInt();
        if (menuOption == 1 || menuOption == 2 || menuOption == 3 || menuOption == 4 || menuOption == 5 || menuOption == 5 || menuOption == 6 || menuOption == 7) {
            return menuOption;
        }else{
            System.out.println("Please Enter Correct Input As per Given");
            return acceptMenuOption(scanner);
        }
    }

    public static boolean wantToContinue(Scanner scanner) {
        System.out.println("Enter Y for Continue N for Exit");
        char ch = scanner.next().toUpperCase().charAt(0);
        return 'Y' == ch;
    }

    public static OwnerDTO acceptOwnerDetailsToSave(Scanner scanner) {
		System.out.println("Enter first name of owner:");
		String firstName = scanner.next();
		System.out.println("Enter last name of owner:");
		String lastName = scanner.next();
		System.out.println("Enter gender of owner:" + Arrays.asList(Gender.values()).toString());
		String gender = scanner.next().toUpperCase();
		System.out.println("Enter city of owner:");
		String city = scanner.next();
		System.out.println("Enter state of owner:");
		String state = scanner.next();
		System.out.println("Enter mobile number of owner:");
		String mobileNumber = scanner.next();
		System.out.println("Enter email id of owner:");
		String emailId = scanner.next();
		try {
			OwnerDTO ownerDTO = new OwnerDTO();
			ownerDTO.setFirstName(firstName);
			ownerDTO.setLastName(lastName);
			ownerDTO.setGender(Gender.valueOf(gender));
			ownerDTO.setCity(city);
			ownerDTO.setState(state);
			ownerDTO.setMobileNumber(mobileNumber);
			ownerDTO.setEmailId(emailId);
			return ownerDTO;
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
			return acceptOwnerDetailsToSave(scanner);
		}
	}

	public static PetDTO acceptPetDetailsToSave(Scanner scanner) {
		System.out.println("Enter name of pet:");
		String petName = scanner.next();
		System.out.println("Enter date of birth of pet (dd-MM-yyyy):");
		String petDateOfBirth = scanner.next();
		System.out.println("Enter gender of pet:" + Arrays.asList(Gender.values()).toString());
		String petGender = scanner.next().toUpperCase();
		System.out.println("Enter pet type:" + Arrays.asList(PetType.values()).toString());
		String petType = scanner.next().toUpperCase();
		try {
			PetDTO petDTO = new PetDTO();
			petDTO.setName(petName);
			petDTO.setBirthDate(convertStringToDate(petDateOfBirth));
			petDTO.setGender(Gender.valueOf(petGender));
			petDTO.setType(PetType.valueOf(petType));
			return petDTO;
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
			return acceptPetDetailsToSave(scanner);
		}
	}

    private static LocalDate convertStringToDate(String petDateOfBirth) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return LocalDate.parse(petDateOfBirth, format);
    }

    public static int acceptOwnerIdToOperate(Scanner scanner) {
        System.out.println("Enter id of owner:");
		return scanner.nextInt();
    }

    public static String acceptPetDetailsToUpdate(Scanner scanner) {
		System.out.println("Enter updated name of pet:");
		return scanner.next();
	}

	public static int acceptPetIdToOperate(Scanner scanner){
		System.out.println("Enter id of pet");
		int petId = scanner.nextInt();
		return petId;
	}
    
}
