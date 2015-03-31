package com.schaer.stammbaum.model;

import java.util.List;

import org.joda.time.LocalDate;

public class Person {

	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private LocalDate deathDate;
	private List<Person> biologicalChildren;
	private List<Person> adoptedChildren;
	
	public Person(String vorname) {
		this.firstName = vorname;
	}

	public String getVorname() {
		return firstName;
	}
}
