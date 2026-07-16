package com.example.repository.impl;

import java.util.Objects;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.config.DatabaseConfig;
import com.example.entity.Owner;
import com.example.entity.Pet;
import com.example.repository.OwnerRepository;

public class OwnerRepositoryImpl implements OwnerRepository{

    private SessionFactory sessionFactory = DatabaseConfig.getSessionFactory();

    @Override
    public void saveOwner(Owner owner) {
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(owner);
            transaction.commit();
        }
    }

    @Override
    public Owner findOwner(int ownerId) {
        try(Session session = sessionFactory.openSession()){
            Owner owner = session.find(Owner.class, ownerId);
            return owner;
        }
    }

    @Override
    public Owner findOwnerWithPet(int ownerId){
        try(Session session = sessionFactory.openSession()){
            Owner owner = session.find(Owner.class, ownerId);
            if (Objects.nonNull(owner)) {
                Hibernate.initialize(owner.getPetList());
            }
            return owner;
        }
    }

    @Override
    public void updatePetDetails(int ownerId,int petId, String petName) {
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            Owner owner = session.find(Owner.class, ownerId);
            if (Objects.nonNull(owner)) {
                Hibernate.initialize(owner.getPetList());
            }
            owner.getPetList().stream().filter(pet -> pet.getId() == petId).findFirst().ifPresent(pet -> pet.setName(petName));
            session.merge(owner);
            transaction.commit();
        }
    }

    public void savePet(int ownerId, Pet pet){
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            Owner owner = session.find(Owner.class, ownerId);
            owner.getPetList().add(pet);
            session.merge(owner);
            transaction.commit();
        }
    }

    @Override
    public void deleteOwner(int ownerId) {
        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            Owner owner = session.find(Owner.class, ownerId);
            session.remove(owner);
            transaction.commit();
        }
    }

}
