package com.example.entity;

import jakarta.persistence.Column;

public class WildPet extends Pet{
    @Column()
    private String birthPlace;
}
