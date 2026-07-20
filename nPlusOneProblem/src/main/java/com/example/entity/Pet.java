package com.example.entity;

import com.example.enums.Gender;
import com.example.enums.PetType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "pet_table")
public class Pet extends Base{

	@Column(nullable = false)
	private String name;

	@Enumerated(value = EnumType.STRING)
	@Column(nullable = false)
	private Gender gender;

	@Enumerated(value = EnumType.STRING)
	@Column(nullable = false)
	private PetType type;

	@OneToOne(mappedBy = "pet")
	private Owner owner;

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setType(PetType type) {
		this.type = type;
	}


	public PetType getType() {
		return type;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Pet [id=" + getId() + ", name=" + name + ", gender=" + gender + ", type=" + type
				+ ", owner=" + owner + "]";
	}
}