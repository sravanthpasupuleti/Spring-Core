package com.example.repository.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.config.DatabaseConfig;
import com.example.entity.Owner;
import com.example.repository.OwnerRepository;

public class OwnerRepositoryImpl implements OwnerRepository{

    private SessionFactory sessionFactory = DatabaseConfig.getSessionFactory();

	@Override
	public Owner findOwner(int ownerId) {
		String hql = "SELECT o FROM Owner o WHERE o.id = :ownerId";
		try (Session session = sessionFactory.openSession()) {
			return session.createSelectionQuery(hql, Owner.class).setParameter("ownerId", ownerId).getSingleResult();
		}
	}

	public List<Owner> findAllOwners(){
		String hql = "SELECT o FROM Owner o";
		try(Session session = sessionFactory.openSession()){
			return session.createSelectionQuery(hql, Owner.class).getResultList();
		}
	}

	public List<Owner> findOwnerWithPet(){
		String hql = "SELECT o FROM Owner o JOIN FETCH o.pet";
		try(Session session = sessionFactory.openSession()){
			return session.createSelectionQuery(hql, Owner.class).getResultList();
		}
	}

}
