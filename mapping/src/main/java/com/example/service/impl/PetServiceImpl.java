package com.example.service.impl;

import java.util.Objects;

import com.example.config.PropertiesConfig;
import com.example.dto.PetDTO;
import com.example.entity.Pet;
import com.example.exception.PetNotFoundException;
import com.example.repository.PetRepository;
import com.example.repository.impl.PetRepositoryImpl;
import com.example.service.PetService;
import com.example.util.MapperUtil;

public class PetServiceImpl implements PetService{

    private PetRepository petRepository;

    public PetServiceImpl(){
        petRepository = new PetRepositoryImpl();
    }

  private static final String PET_NOT_FOUND = "pet.not.found";
  private static final PropertiesConfig PROPERTIES_CONFIG = PropertiesConfig.getInstance();

    public PetDTO findPet(int petId) throws PetNotFoundException{
        Pet pet = petRepository.findPet(petId);
        if (Objects.isNull(pet)) {
            throw new PetNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(PET_NOT_FOUND), petId));
        }
        return MapperUtil.convertPetEntityToDtoWithoutOwner(pet);
    }

    public void deletePet(int petId) throws PetNotFoundException{
        Pet pet = petRepository.findPet(petId);
        if (Objects.isNull(pet)) {
            throw new PetNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(PET_NOT_FOUND), petId));
        }
        petRepository.deletePet(petId);
    }
}
