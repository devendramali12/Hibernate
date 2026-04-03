package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // --> Marks this class as a Hibernate / JPA entity (mapped to a table)
@Table (name= "student")
// Specifies the table name in the database
public class Student {
	
	@Id
// --> Marks This field as PRIMARY KEY in the table
	private int id;
	
	@Column(name="name")
// --> 	Maps this variable to a column in DB (optional if name is same)
	private String name;
	
// --> No annotation → Hibernate will automatically map it as a column (same name)
    private String city;

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
	

}
