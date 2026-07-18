package com.example.service;

import com.example.dto.OwnerDTO;
import com.example.dto.PetDTO;
import com.example.exception.DuplicateOwnerException;
import com.example.exception.OwnerNotFoundException;
import com.example.exception.PetNotFoundException;

public interface OwnerService {
    void saveOwner(OwnerDTO ownerDTO);

	OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException;

	void updatePetDetails(int ownerId, String petName) throws OwnerNotFoundException;

	void deleteOwner(int ownerId) throws OwnerNotFoundException;
}
