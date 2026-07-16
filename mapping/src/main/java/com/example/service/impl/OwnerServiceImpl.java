package com.example.service.impl;

import java.util.List;
import java.util.Objects;

import com.example.config.PropertiesConfig;
import com.example.dto.OwnerDTO;
import com.example.dto.PetDTO;
import com.example.entity.Owner;
import com.example.entity.Pet;
import com.example.exception.DuplicateOwnerException;
import com.example.exception.OwnerNotFoundException;
import com.example.exception.PetNotFoundException;
import com.example.repository.OwnerRepository;
import com.example.repository.impl.OwnerRepositoryImpl;
import com.example.service.OwnerService;
import com.example.util.MapperUtil;

public class OwnerServiceImpl implements OwnerService{

    private OwnerRepository ownerRepository;

    private static final String OWNER_NOT_FOUND = "owner.not.found";
    private static final String PET_NOT_FOUND = "pet.not.found";
    private static final String OWNER_ALREADY_EXITS = "owner.already.exists";
	private static final PropertiesConfig PROPERTIES_CONFIG = PropertiesConfig.getInstance();
    
    public OwnerServiceImpl(){
        ownerRepository = new OwnerRepositoryImpl();
    }

    public void saveOwner(OwnerDTO ownerDTO) throws DuplicateOwnerException{
        Owner owner = MapperUtil.convertOwnerDtoToEntity(ownerDTO);
        ownerRepository.saveOwner(owner);
    }

    @Override
    public OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException {
        Owner owner = ownerRepository.findOwner(ownerId);
        if (Objects.isNull(owner)) {
            throw new OwnerNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(OWNER_NOT_FOUND), ownerId));
        }
        OwnerDTO ownerDTO = MapperUtil.convertOwnerEntityToDtoWithoutPet(owner);
        return ownerDTO;
    }

    public OwnerDTO findOwnerWithPet(int ownerId) throws OwnerNotFoundException {
        Owner owner = ownerRepository.findOwnerWithPet(ownerId);
        if (Objects.isNull(owner)) {
            throw new OwnerNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(OWNER_NOT_FOUND), ownerId));
        }
        return MapperUtil.convertOwnerEntityToDto(owner);
    }

    @Override
    public void updatePetDetails(int ownerId, int petId, String petName) throws OwnerNotFoundException, PetNotFoundException {
        Owner owner = ownerRepository.findOwnerWithPet(ownerId);
        if (Objects.isNull(owner)) {
            throw new OwnerNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(OWNER_NOT_FOUND), ownerId));
        }else if (owner.getPetList().stream().filter(pet -> pet.getId() == petId).findFirst().isEmpty()) {
            throw new PetNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(PET_NOT_FOUND), petId));
        }else {
            ownerRepository.updatePetDetails(ownerId, petId, petName);
        }
    }

    @Override
    public void deleteOwner(int ownerId) throws OwnerNotFoundException {
        Owner owner = ownerRepository.findOwner(ownerId);
        if (Objects.isNull(owner)) {
            throw new OwnerNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(OWNER_NOT_FOUND), ownerId));
        }
        ownerRepository.deleteOwner(ownerId);
    }

    public void savePet(int ownerId, PetDTO petDTO) throws OwnerNotFoundException{
        Owner owner = ownerRepository.findOwner(ownerId);
        if (Objects.isNull(owner)) {
            throw new OwnerNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(OWNER_NOT_FOUND), ownerId));
        }
        Pet pet = MapperUtil.convertPetDtoToEntity(petDTO);
        pet.setOwner(owner);
        ownerRepository.savePet(ownerId, pet);
    }

}