package one_to_one_uni;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		// Create Objects
		
		Person p = new Person();
		p.setName("Devendra");
		
		Person p1 = new Person();
		p1.setName("Rajesh");
		
		Aadharcard card = new Aadharcard();
		card.setAadharNumber("1234-5678-2468");
	
		Aadharcard c1 = new Aadharcard();
		c1.setAadharNumber("1234-9874-5632");
		
		p.setAadharCard(card);
		p1.setAadharCard(c1);
		
		et.begin();
		em.persist(p);
		em.persist(p1);
		et.commit();
		
		System.out.println("Saved Successfully");
	
	}

}
