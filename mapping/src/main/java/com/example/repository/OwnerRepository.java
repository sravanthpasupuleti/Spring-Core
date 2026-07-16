package com.example.repository;

import com.example.entity.Owner;
import com.example.entity.Pet;

public interface OwnerRepository {
	
    void saveOwner(Owner owner);

	Owner findOwner(int ownerId);

	Owner findOwnerWithPet(int ownerId);

	void updatePetDetails(int ownerId, int petId, String petName);

	void savePet(int ownerId, Pet pet);

	void deleteOwner(int ownerId);
}
