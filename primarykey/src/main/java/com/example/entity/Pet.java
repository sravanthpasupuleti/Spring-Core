package com.example.entity;

import java.time.LocalDate;

import com.example.enums.Gender;
import com.example.enums.PetType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pet_table")
public class Pet {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String name;

	@Column(name = "date_of_birth", nullable = false)
	private LocalDate birthDate;

	@Enumerated(value = EnumType.STRING)
	@Column(nullable = false)
	private Gender gender;

	@Enumerated(value = EnumType.STRING)
	@Column(nullable = false)
	private PetType type;

	public int getId() {
		return id;
	}

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

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setType(PetType type) {
		this.type = type;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public PetType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", gender=" + gender + ", type=" + type
				+ "]";
	}
}