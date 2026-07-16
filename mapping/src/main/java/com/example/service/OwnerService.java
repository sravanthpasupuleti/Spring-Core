package com.example.service;

import com.example.dto.OwnerDTO;
import com.example.dto.PetDTO;
import com.example.exception.DuplicateOwnerException;
import com.example.exception.OwnerNotFoundException;
import com.example.exception.PetNotFoundException;

public interface OwnerService {
    void saveOwner(OwnerDTO ownerDTO) throws DuplicateOwnerException;

	OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException;

	void updatePetDetails(int ownerId,int petId, String petName) throws OwnerNotFoundException, PetNotFoundException;

	void deleteOwner(int ownerId) throws OwnerNotFoundException;

	OwnerDTO findOwnerWithPet(int ownerId) throws OwnerNotFoundException ;

	public void savePet(int ownerId, PetDTO petDTO) throws OwnerNotFoundException;
}
