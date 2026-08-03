package com.example.repository.impl;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.entity.Pet;
import com.example.repository.PetRepository;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

@Repository
public class PetRepositoryImpl implements PetRepository{

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Override
    public Optional<Pet> findById(int petId) {
        return null;
    }

}
