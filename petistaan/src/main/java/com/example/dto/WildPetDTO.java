package com.example.dto;

import com.example.enums.Gender;
import com.example.enums.PetType;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class WildPetDTO extends PetDTO{

    @Builder
    public WildPetDTO(int id, String name, Gender gender,  PetType type, OwnerDTO ownerDTO, String birthPlace){
        super(id, name, gender, type, ownerDTO);
        this.birthPlace = birthPlace;
    }

    private String birthPlace;
}
