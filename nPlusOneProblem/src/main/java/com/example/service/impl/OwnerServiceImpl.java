package com.example.service.impl;
import java.util.List;
import java.util.Objects;

import com.example.config.PropertiesConfig;
import com.example.dto.OwnerDTO;
import com.example.entity.Owner;
import com.example.exception.OwnerNotFoundException;
import com.example.repository.OwnerRepository;
import com.example.repository.impl.OwnerRepositoryImpl;
import com.example.service.OwnerService;
import com.example.util.MapperUtil;

public class OwnerServiceImpl implements OwnerService{

    private OwnerRepository ownerRepository;
	private static final String OWNER_NOT_FOUND = "owner.not.found";
	private static final PropertiesConfig PROPERTIES_CONFIG = PropertiesConfig.getInstance();

	public OwnerServiceImpl() {
		this.ownerRepository = new OwnerRepositoryImpl();
	}

	@Override
	public OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException {
		Owner owner = ownerRepository.findOwner(ownerId);
		if (Objects.isNull(owner)) {
			throw new OwnerNotFoundException(String.format(PROPERTIES_CONFIG.getProperty(OWNER_NOT_FOUND), ownerId));
		}
		return MapperUtil.convertOwnerEntityToDtoWithoutPet(owner);
	}

	public List<OwnerDTO> findAllOwners(){
		List<Owner> ownerList = ownerRepository.findAllOwners();
		return ownerList.stream().map(MapperUtil::convertOwnerEntityToDtoWithoutPet).toList();
	}

	public List<OwnerDTO> findOwnerWithPet(){
		List<Owner> ownerList = ownerRepository.findOwnerWithPet();
		return ownerList.stream().map(MapperUtil::convertOwnerEntityToDto).toList();
	}

}