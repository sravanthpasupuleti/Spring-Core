package com.example.repository;

import java.util.Optional;
import com.example.entity.Pet;

public interface PetRepository {
    Optional<Pet> findById(int petId);
}
