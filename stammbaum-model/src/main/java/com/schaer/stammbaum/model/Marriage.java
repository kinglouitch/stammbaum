package com.schaer.stammbaum.model;

import org.joda.time.LocalDate;

public class Marriage {

	private Person marriedPersonA;
	private Person marriedPersonB;
	private LocalDate marriageDate;
	private LocalDate divorceDate;
	
	public Marriage(Person marriedPersonA, Person marriedPersonB, LocalDate marriageDate) {
		this.marriedPersonA = marriedPersonA;
		this.marriedPersonB = marriedPersonB;
		this.marriageDate = marriageDate;
	}
	
	public void divorce(LocalDate divorceDate) {
		this.divorceDate = divorceDate;
	}
}
