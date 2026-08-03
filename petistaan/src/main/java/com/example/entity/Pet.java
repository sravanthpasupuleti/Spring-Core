package com.example.entity;
import com.example.enums.Gender;
import com.example.enums.PetType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Inheritance;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pet_table")
@Inheritance(strategy = jakarta.persistence.InheritanceType.JOINED)
@Setter
@Getter
public abstract class Pet extends Base{

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PetType type;

    @OneToOne(mappedBy = "pet")
    private Owner owner;
}
