package com.example.repository;

import java.util.List;

import com.example.entity.Owner;

public interface OwnerRepository {
    void saveOwner(Owner owner);

	Owner findOwner(int ownerId);

	void updatePetDetails(int ownerId, String petName);

	void deleteOwner(int ownerId);

	// List<Owner> findAllOwners();
}
