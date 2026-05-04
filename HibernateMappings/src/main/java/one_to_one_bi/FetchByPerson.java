package one_to_one_bi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchByPerson {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	
	Person p1 = em.find(Person.class, 101);
	
	if(p1!=null) {
		System.out.println("----------Person---------------");
		System.out.println(p1.getPid());
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		Passport p=p1.getPassport();
		System.out.println("------------------Passport------------------");
		System.out.println(p.getPid());
		System.out.println(p.getValid());
		
	}else {
		System.out.println("Not Found");
	}
}
}
