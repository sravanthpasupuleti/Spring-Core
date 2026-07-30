package com.example.service;

import java.util.List;

import com.example.dto.OwnerDTO;
import com.example.exception.OwnerNotFoundException;

public interface OwnerService {
    void saveOwner(OwnerDTO ownerDTO);

    OwnerDTO findOwner(int ownerid) throws OwnerNotFoundException;

    void updatePetDetails(int ownerId, String petName) throws OwnerNotFoundException;

    void deleteOwner(int ownerId) throws OwnerNotFoundException;

    List<OwnerDTO> findAllOwners();
}
