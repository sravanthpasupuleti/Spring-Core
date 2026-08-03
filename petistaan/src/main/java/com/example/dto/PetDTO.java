package com.example.dto;

import com.example.enums.Gender;
import com.example.enums.PetType;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Setter
@Getter
@ToString
public abstract class PetDTO {

    @EqualsAndHashCode.Include
    private int id;
    private String name;
    private Gender gender;
    private PetType type;
    private OwnerDTO ownerDTO;
    
}
