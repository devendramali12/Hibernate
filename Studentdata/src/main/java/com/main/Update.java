package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Student;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = new Student();
		s=em.find(Student.class, 1);
		
		if(s!=null) {
			s.setName("Devendra Mali");
			s.setCity("Ulhasnagar");
			
			et.begin();
			em.merge(s);
			et.commit();
			System.out.println("Updated");
			
		}else {
			System.out.println("Student Not Found");
		}
	}

}
