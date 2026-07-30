package com.example.dto;

import com.example.enums.Gender;
import com.example.enums.PetType;

public class PetDTO {
    private int id;
    private String name;
    private Gender gender;
    private PetType type;
    private OwnerDTO ownerDTO;
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public PetType getType() {
        return type;
    }
    public void setType(PetType type) {
        this.type = type;
    }
    public OwnerDTO getOwnerDTO() {
        return ownerDTO;
    }
    public void setOwnerDTO(OwnerDTO ownerDTO) {
        this.ownerDTO = ownerDTO;
    }
    @Override
    public String toString() {
        return "PetDTO [id=" + id + ", name=" + name + ", gender=" + gender + ", PetType=" + type + ", ownerDTO="
                + ownerDTO + "]";
    }
}
