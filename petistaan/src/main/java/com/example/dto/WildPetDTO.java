package com.example.dto;

import java.util.Objects;

public class WildPetDTO extends PetDTO{
    private String birthPlace;

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @Override
    public String toString() {
        if(Objects.nonNull(getOwnerDTO())){
            return "WildPetDTO [birthPlace=" + birthPlace + ", getBirthPlace()=" + getBirthPlace() + ", getId()=" + getId()
                + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getType()=" + getType()
                + ", getOwnerDTO()=" + getOwnerDTO() + "]";
        }else{
            return "WildPetDTO [birthPlace=" + birthPlace + ", getBirthPlace()=" + getBirthPlace() + ", getId()=" + getId()
                + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getType()=" + getType()
                + "]";
        }
        
    }

    
    
}
