package com.example.repository;

import com.example.entity.Pet;

public interface PetRepository {
    Pet findPet(int petId);
}
