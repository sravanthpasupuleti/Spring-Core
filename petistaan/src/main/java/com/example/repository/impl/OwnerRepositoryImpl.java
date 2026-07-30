package com.example.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.dto.OwnerDTO;
import com.example.repository.OwnerRepository;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository{

    public OwnerRepositoryImpl(){
        ownerDTOList = new ArrayList<>();
    }

    @Override
    public void save(OwnerDTO ownerDTO) {
        ownerDTOList.add(ownerDTO);
    }

    @Override
    public Optional<OwnerDTO> findById(int ownerId) {
        return ownerDTOList.stream().filter(owner -> owner.getId() == ownerId).findFirst();
    }

    @Override
    public void updatePetDetails(int ownerId, String petName) {
        ownerDTOList.stream().filter(owner -> owner.getId() == ownerId).findFirst().ifPresent(o -> o.getPetDTO().setName(petName));
    }

    @Override
    public void deleteById(int ownerId) {
        ownerDTOList.removeIf(o -> o.getId() == ownerId);
    }

    @Override
    public List<OwnerDTO> findAll() {
        return ownerDTOList;
    }

}
