package com.example.service;

import java.util.List;

import com.example.dto.PetDTO;
import com.example.exception.PetNotFoundException;

public interface PetService {

   PetDTO findPet(int petId) throws PetNotFoundException;

   List<PetDTO> findAllPets();
}
