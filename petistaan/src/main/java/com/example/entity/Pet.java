package com.example.entity;
import com.example.enums.PetType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pet_table")
@Inheritance(strategy = jakarta.persistence.InheritanceType.JOINED)
public class Pet extends Base{

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private PetType type;

    @OneToOne(mappedBy = "pet")
    private Owner owner;
}
