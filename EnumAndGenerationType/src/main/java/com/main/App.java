package com.main;

import com.entities.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		// AUTO
		Student s = new Student();
		s.setName("Rahul");
		
		Student s1 = new Student();
		s1.setName("LALA");
		
		Student s2 = new Student();
		s2.setName("Bala");
		
		// IDENTITY
        Employee e = new Employee();
        e.setName("Devendra");

        // SEQUENCE
        Product p = new Product();
        p.setName("Laptop");

        // TABLE
        Customer c = new Customer();
        c.setName("Amit");
        
        et.begin();
        em.persist(s);
        em.persist(e);
        em.persist(p);
        em.persist(c);
        
        em.persist(s1);
        em.persist(s2);
        
        et.commit();
        
       
        
        System.out.println("All Data Saved Successfully");
		
	}

}
