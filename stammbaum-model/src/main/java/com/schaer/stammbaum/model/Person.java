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
	private List<Marriage> marriages;
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public void marry(Person personToMarry, LocalDate marriageDate) {
		marriages.add(new Marriage(this, personToMarry, marriageDate));
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
