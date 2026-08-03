package com.example.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.example.dto.DomesticPetDTO;
import com.example.dto.OwnerDTO;
import com.example.dto.PetDTO;
import com.example.dto.WildPetDTO;
import com.example.entity.DomesticPet;
import com.example.entity.Owner;
import com.example.entity.Pet;
import com.example.entity.WildPet;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OwnerMapper {

    String UNSOPORTED_OWNER_INSTANCE = "unsoported owner instance : %s";

    @Mapping(source = "petDTO", target = "pet")
	Owner ownerDTOToOwner(OwnerDTO ownerDTO);

	default Pet petDTOToPet(PetDTO petDTO) {
		return switch (petDTO) {
            case DomesticPetDTO domesticPetDTO -> domesticPetDTOToDomesticPet(domesticPetDTO);
            case WildPetDTO wildPetDTO -> wildPetDTOToWildPet(wildPetDTO);
            default -> throw new IllegalArgumentException(String.format(UNSOPORTED_OWNER_INSTANCE, petDTO.getClass()));
		};
	}

	@Mapping(target = "owner", ignore = true)
	DomesticPet domesticPetDTOToDomesticPet(DomesticPetDTO domesticPetDTO);

	@Mapping(target = "owner", ignore = true)
	WildPet wildPetDTOToWildPet(WildPetDTO wildPetDTO);
	
	@Mapping(source = "pet", target = "petDTO")
	OwnerDTO ownerToOwnerDTO(Owner owner);

	default PetDTO petToPetDTO(Pet pet) {
		return switch (pet) {
		case DomesticPet domesticPet -> domesticPetToDomesticPetDTO(domesticPet);
		case WildPet wildPet -> wildPetToWildPetDTO(wildPet);
		default -> throw new IllegalArgumentException(String.format(UNSOPORTED_OWNER_INSTANCE, pet.getClass()));
		};
	}

	@Mapping(target = "ownerDTO", ignore = true)
	DomesticPetDTO domesticPetToDomesticPetDTO(DomesticPet domesticPet);

	@Mapping(target = "ownerDTO", ignore = true)
	WildPetDTO wildPetToWildPetDTO(WildPet wildPet);
}
