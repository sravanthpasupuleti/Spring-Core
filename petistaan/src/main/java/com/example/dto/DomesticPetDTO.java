package com.example.dto;

import java.time.LocalDate;
import java.util.Objects;

public class DomesticPetDTO extends PetDTO{
    private LocalDate birthDate;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        if (Objects.nonNull(getOwnerDTO())) {
            return "DomesticPetDTO [birthDate=" + birthDate + ", getBirthDate()=" + getBirthDate() + ", getId()=" + getId()
                + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getType()=" + getType()
                + ", getOwnerDTO()=" + getOwnerDTO() + "]";
        }else{
             return "DomesticPetDTO [birthDate=" + birthDate + ", getBirthDate()=" + getBirthDate() + ", getId()=" + getId()
                + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getType()=" + getType()
                + "]";
        }
        
    }

    
    
}
