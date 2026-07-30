package com.example.repository;

import java.util.List;
import java.util.Optional;

import com.example.dto.OwnerDTO;

public interface OwnerRepository {
    void save(OwnerDTO ownerDTO);

    Optional<OwnerDTO> findById(int ownerId);

    void updatePetDetails(int ownerId, String petName);

    void deleteById(int ownerId);

    List<OwnerDTO> findAll();
}
