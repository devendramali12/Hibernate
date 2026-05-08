package com.test;

import com.entity.User;
import com.enums.UserRole;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		User u1 = new User();
		u1.setName("Devendra");
		u1.setRole(UserRole.DEVELOPER);
		
		User u2 = new User();
		u2.setName("Ramesh");
		u2.setRole(UserRole.ADMIN);
		
		em.persist(u1);
		em.persist(u2);
		
		et.commit();
		
		System.out.println("User Saved");
	}

}
