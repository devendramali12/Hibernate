package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Student;

public class Save {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Devendra");
		s1.setCity("Thane");
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("LALA");
		s2.setCity("Mulund");
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		et.commit();
		
		System.out.println("Data Has Been Saved");
	}

}
