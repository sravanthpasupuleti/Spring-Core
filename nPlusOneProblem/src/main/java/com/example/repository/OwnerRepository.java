package com.example.repository;

import java.util.List;

import com.example.entity.Owner;

public interface OwnerRepository {

	Owner findOwner(int ownerId);

	List<Owner> findOwnerWithPet();

	List<Owner> findAllOwners();
}
