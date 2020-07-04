package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Member extends Person {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;

	private String memberNumber;
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Member(String memberNumber) {
		super();
		this.memberNumber = memberNumber;
	}

	public Member(String memberNumber, String surname, String firstname, String secondname) {
		super(surname, firstname, secondname);
		this.memberNumber = memberNumber;
	}

	public String getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", memberNumber=" + memberNumber + ", toString()=" + super.toString() + "]";
	}

}
