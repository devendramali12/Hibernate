package com.onetoone;

import jakarta.persistence.*;

@Entity
public class Person {
	
	@Id
	private int pid;
	private String name;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passport_id")
	private Passport passport;


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
	
	

}
