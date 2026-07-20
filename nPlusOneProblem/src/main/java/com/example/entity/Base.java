package com.example.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Base {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    public int getId(){
        return id;
    }
}
