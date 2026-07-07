package com.example.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.example.entity.Owner;
import com.example.entity.Pet;

public class DatabaseConfig {
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

	private DatabaseConfig() {

	}

	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
					configuration.addAnnotatedClass(Owner.class);
					configuration.addAnnotatedClass(Pet.class);
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
}
