package com.example.hibernate_jpa.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernate_jpa.model.Custumer;

public interface Custumerrepo extends JpaRepository<Custumer , Integer>{
    
}
