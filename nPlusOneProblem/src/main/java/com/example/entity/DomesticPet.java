package com.example.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "domestic_pet_table")
public class DomesticPet extends Pet{
    @Column(name = "date_of_birth", nullable = false)
    private LocalDate birthDate;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "DomesticPet [getLocalDate()=" + getBirthDate() + ", getId()=" + getId() + ", getGender()=" + getGender()
                + ", getName()=" + getName() + ", getType()=" + getType() + ", getOwner()=" + getOwner() + "]";
    }
    
}
