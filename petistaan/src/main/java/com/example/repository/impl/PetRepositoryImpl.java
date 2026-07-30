package com.example.repository.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.dto.PetDTO;
import com.example.repository.PetRepository;

@Repository
public class PetRepositoryImpl implements PetRepository{

    public PetRepositoryImpl(){
        this.petDTOList = new ArrayList<>();
    }

    @Override
    public Optional<PetDTO> findById(int petId) {
        return petDTOList.stream().filter(pet -> pet.getId() == petId).findFirst();
    }

}
