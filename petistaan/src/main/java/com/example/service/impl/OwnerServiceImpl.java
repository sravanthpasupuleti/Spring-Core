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
import com.example.util.OwnerMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService{

    private final OwnerRepository ownerRepository;

    private final OwnerMapper ownerMapper;

    @Value("${owner.not.found}")
    private String ownerNotFound;

    @Override
    public void saveOwner(OwnerDTO ownerDTO){
        Owner owner = ownerMapper.ownerDTOToOwner(ownerDTO);
        ownerRepository.save(owner);
    }

    @Override
    public OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException{
        return ownerRepository.findById(ownerId).map(ownerMapper::ownerToOwnerDTO).orElseThrow(() -> new OwnerNotFoundException(String.format(ownerNotFound, ownerId)));
    }

    @Override
    public void updatePetDetails(int ownerId, String petName) throws OwnerNotFoundException{
        if(ownerRepository.findById(ownerId).isEmpty()){
            throw new OwnerNotFoundException(String.format(ownerNotFound, ownerId));
        }
        ownerRepository.updatePetDetails(ownerId, petName);
    }

    @Override
    public void deleteOwner(int ownerId) throws OwnerNotFoundException{
        if(ownerRepository.findById(ownerId).isEmpty()){
            throw new OwnerNotFoundException(String.format(ownerNotFound, ownerId));
        }
        ownerRepository.deleteById(ownerId);
    }

    @Override
    public List<OwnerDTO> findAllOwners() {
        return ownerRepository.findAll().stream().map(ownerMapper::ownerToOwnerDTO).toList();
    }
    
}
