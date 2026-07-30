package com.example.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.dto.PetDTO;
import com.example.exception.PetNotFoundException;
import com.example.repository.PetRepository;
import com.example.service.PetService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetService{
    private final PetRepository petRepository;

    @Value("${pet.not.found}")
    private String petNotFound;

    @Override
    public PetDTO findPet(int petId) throws PetNotFoundException {
        return petRepository.findById(petId).orElseThrow(() -> new PetNotFoundException(String.format(petNotFound, petId)));
    }
}
