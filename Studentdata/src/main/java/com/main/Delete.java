package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Student;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = new Student();
		s=em.find(Student.class, 1);
		
		if(s !=null) {
			et.begin();
			em.remove(s);
			et.commit();
			System.out.println("Deleted");
			
		}else {
			System.out.println("Student Not Found");
		}
	}

}
