package com.one_to_one;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Address a1 = new Address();
		a1.setCity("Mumbai");
		a1.setState("Maharashtra");
		
		Student s1 = new Student();
		s1.setName("Devnedra");
		s1.setAddress(a1);
		
		et.begin();
		em.persist(s1);
		et.commit();
		
		System.out.println("Saved Successfully");
	}

}
