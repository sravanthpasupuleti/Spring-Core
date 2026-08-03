package com.example.dto;

import java.time.LocalDate;

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
public class DomesticPetDTO extends PetDTO{
    
    @Builder
    public DomesticPetDTO(int id, String name, Gender gender,  PetType type, OwnerDTO ownerDTO, LocalDate birthDate) {
        super(id, name, gender, type, ownerDTO);
        this.birthDate = birthDate;
    }

    private LocalDate birthDate;
}