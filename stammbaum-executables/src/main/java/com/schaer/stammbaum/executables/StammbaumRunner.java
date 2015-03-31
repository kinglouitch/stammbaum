package com.schaer.stammbaum.executables;

import com.schaer.stammbaum.model.Person;

public class StammbaumRunner {

	public static void main(String[] args) {
		Person person = new Person("klaus");
		System.out.println("person heisst: " +person.getVorname());
	}

}
