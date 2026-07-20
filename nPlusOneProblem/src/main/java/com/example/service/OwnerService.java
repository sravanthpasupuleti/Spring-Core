package com.example.service;

import java.util.List;

import com.example.dto.OwnerDTO;
import com.example.exception.OwnerNotFoundException;

public interface OwnerService {
	OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException;

	List<OwnerDTO> findAllOwners();

	List<OwnerDTO> findOwnerWithPet();
}
