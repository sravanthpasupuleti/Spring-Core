package com.example.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.example.dto.DomesticPetDTO;
import com.example.dto.PetDTO;
import com.example.dto.WildPetDTO;
import com.example.entity.DomesticPet;
import com.example.entity.Pet;
import com.example.entity.WildPet;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PetMapper {

    String UNSOPORTED_PET_INSTANCE = "unsoported pet instance : %s";

    default PetDTO petToPetDTO(Pet pet){
        return switch(pet){
            case DomesticPet domesticPet -> domesticPetToDomesticPetDTO(domesticPet);
		    case WildPet wildPet -> wildPetToWildPetDTO(wildPet);
            default -> throw new IllegalArgumentException(String.format(UNSOPORTED_PET_INSTANCE, pet.getClass()));
        };
    }

    @Mapping(target = "ownerDTO.petDTO", ignore = true)
	@Mapping(source = "owner", target = "ownerDTO")
	DomesticPetDTO domesticPetToDomesticPetDTO(DomesticPet domesticPet);

	@Mapping(target = "ownerDTO.petDTO", ignore = true)
	@Mapping(source = "owner", target = "ownerDTO")
	WildPetDTO wildPetToWildPetDTO(WildPet wildPet);
}
