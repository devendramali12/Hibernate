package com.onetoone;

import jakarta.persistence.*;

@Entity
public class Passport {
	
	@Id
	private int passportid;
	private String passportnumber;
	
	@OneToOne(mappedBy="passport")
	private Person person;

	public int getPassportid() {
		return passportid;
	}

	public void setPassportid(int passportid) {
		this.passportid = passportid;
	}

	public String getPassportnumber() {
		return passportnumber;
	}

	public void setPassportnumber(String passportnumber) {
		this.passportnumber = passportnumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
