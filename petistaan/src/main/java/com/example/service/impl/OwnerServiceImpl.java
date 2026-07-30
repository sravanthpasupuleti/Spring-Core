package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.dto.OwnerDTO;
import com.example.entity.Owner;
import com.example.exception.OwnerNotFoundException;
import com.example.repository.OwnerRepository;
import com.example.service.OwnerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService{

    private final OwnerRepository ownerRepository;

    @Value("${owner.not.found}")
    private String ownerNotFound;

    @Override
    public void saveOwner(OwnerDTO ownerDTO){
        
    }

    @Override
    public OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException{
        return ownerRepository.findById(ownerId).orElseThrow(() -> new OwnerNotFoundException(String.format(ownerNotFound, ownerId)));
    }

    @Override
    public void updatePetDetails(int ownerId, String petName) throws OwnerNotFoundException{
        ownerRepository.findById(ownerId).orElseThrow(() -> new OwnerNotFoundException(String.format(ownerNotFound, ownerId)));
        ownerRepository.updatePetDetails(ownerId, petName);
    }


    @Override
    public void deleteOwner(int ownerId) throws OwnerNotFoundException{
        ownerRepository.findById(ownerId).orElseThrow(() -> new OwnerNotFoundException(String.format(ownerNotFound, ownerId)));
        ownerRepository.deleteById(ownerId);
    }

    @Override
    public List<OwnerDTO> findAllOwners() {
        return ownerRepository.findAll();
    }

    
}
