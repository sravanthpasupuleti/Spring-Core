package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "wild_pet_table")
public class WildPet extends Pet{
    @Column(name = "birth_place", nullable = false)
    private String birthPlace;
}