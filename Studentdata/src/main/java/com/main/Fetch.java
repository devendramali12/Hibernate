package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Student;

public class Fetch {
	
	public static void main(String[] args) {
	EntityManagerFactory emf =	Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	
	Student s1 = new Student();
	s1= em.find(Student.class, 1);
	
	if(s1!= null) {
		System.out.println("---Student---");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getCity());
	}else {
		System.out.println("Student Not Found");
	}
	}

}
