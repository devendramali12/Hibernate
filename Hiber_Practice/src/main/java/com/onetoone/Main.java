package com.onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setPid(1);
		p.setName("Devendra");
		
		Passport pass = new Passport();
		pass.setPassportid(101);
		pass.setPassportnumber("P12345");
		
		p.setPassport(pass);
		pass.setPerson(p);
		
		et.begin();
		em.persist(p);
		et.commit();
		System.out.println("Saved Successfully");
	}

}
