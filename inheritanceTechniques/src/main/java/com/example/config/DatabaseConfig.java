package com.example.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.example.entity.DomesticPet;
import com.example.entity.Owner;
import com.example.entity.Pet;
import com.example.entity.WildPet;

public class DatabaseConfig {
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

	private DatabaseConfig() {

	}

	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration()
					 .addAnnotatedClass(Owner.class)
					 .addAnnotatedClass(Pet.class)
					 .addAnnotatedClass(DomesticPet.class)
					 .addAnnotatedClass(WildPet.class);
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
}
