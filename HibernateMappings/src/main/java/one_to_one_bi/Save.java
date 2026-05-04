package one_to_one_bi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p1 = new Person();
		p1.setPid(101);
		p1.setAge(22);
		p1.setName("Devendra");
		
		Passport p = new Passport();
		p.setPid(111);
		p.setValid(28);
		
		p1.setPassport(p);
		p.setPerson(p1);
		et.begin();
		em.persist(p1);
		em.persist(p);
		et.commit();
		
		System.out.println("Saved");
	}

}
