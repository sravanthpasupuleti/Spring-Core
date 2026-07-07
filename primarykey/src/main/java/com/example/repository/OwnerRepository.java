package com.example.repository;

import com.example.entity.Owner;
import com.example.entity.Pet;

public interface OwnerRepository {
    void saveOwner(Owner owner);

	Owner findOwner(int ownerId);

	void updatePetDetails(int ownerId, String petName);

	void deleteOwner(int ownerId);
}
