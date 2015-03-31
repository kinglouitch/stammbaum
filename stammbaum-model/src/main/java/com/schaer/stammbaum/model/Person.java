package com.schaer.stammbaum.model;

import java.util.List;

import org.joda.time.LocalDate;

public class Person {

	private Gender gender;
	private String firstName;
	private String lastName;
	private String unmarriedLastName;
	private LocalDate birthDate;
	private LocalDate deathDate;
	private List<Person> biologicalChildren;
	private List<Person> adoptedChildren;
	
	public Person(Gender gender) {
		this.gender = gender;
	}

	public String getVorname() {
		return firstName;
	}

	public Gender getGender() {
		return gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUnmarriedLastName() {
		return unmarriedLastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public LocalDate getDeathDate() {
		return deathDate;
	}

	public List<Person> getBiologicalChildren() {
		return biologicalChildren;
	}

	public List<Person> getAdoptedChildren() {
		return adoptedChildren;
	}
}
