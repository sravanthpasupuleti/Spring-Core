package com.example.repository;

import java.util.List;

import com.example.entity.Pet;

public interface PetRepository {
    Pet findPet(int petId);

    List<Pet> findAllPets();
}
