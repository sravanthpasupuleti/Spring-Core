package com.example.repository;

import java.util.Optional;

import com.example.dto.PetDTO;

public interface PetRepository {
    Optional<PetDTO> findById(int petId);
}
