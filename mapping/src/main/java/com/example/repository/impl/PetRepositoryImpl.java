package com.example.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.config.DatabaseConfig;
import com.example.entity.Pet;
import com.example.repository.PetRepository;

public class PetRepositoryImpl implements PetRepository{

    private SessionFactory sessionFactory = DatabaseConfig.getSessionFactory();
     
    public Pet findPet(int petId){
        try(Session session = sessionFactory.openSession()){
            Pet pet = session.find(Pet.class, petId);
            return pet;
        }
    }

    @Override
    public void deletePet(int petId) {
       try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            Pet pet = session.find(Pet.class, petId);
            session.remove(pet);
            transaction.commit();
       }
    }

    
}
