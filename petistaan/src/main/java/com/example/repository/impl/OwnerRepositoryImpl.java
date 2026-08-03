package com.example.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.dto.OwnerDTO;
import com.example.entity.Owner;
import com.example.repository.OwnerRepository;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository{

    // @PersistenceUnit
    // private EntityManagerFactory entityManagerFactory;

    @Override
    public void save(Owner owner) {
        
    }

    @Override
    public Optional<Owner> findById(int ownerId) {
        return null;
    }

    @Override
    public void updatePetDetails(int ownerId, String petName) {
        
    }

    @Override
    public void deleteById(int ownerId) {
        
    }

    @Override
    public List<Owner> findAll() {
        return null;
    }

}
