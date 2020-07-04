package com.example.demo.model;

import javax.persistence.*;

@MappedSuperclass
public class Person {
	private String surname;
	private String firstname;
	private String secondname;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String surname, String firstname, String secondname) {
		super();
		this.surname = surname;
		this.firstname = firstname;
		this.secondname = secondname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	@Override
	public String toString() {
		return "Person [surname=" + surname + ", firstname=" + firstname + ", secondname=" + secondname + "]";
	}
	
	
}
