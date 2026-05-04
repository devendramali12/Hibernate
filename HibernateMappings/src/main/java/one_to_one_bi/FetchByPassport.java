package one_to_one_bi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchByPassport {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Passport p = em.find(Passport.class, 111);
		
		if(p!=null) {
			System.out.println("----Passport----");
			System.out.println(p.getPid());
			System.out.println(p.getValid());
			
			Person p1 = p.getPerson();
			
			System.out.println("----Person----");
			System.out.println(p1.getName());
			System.out.println(p1.getAge());
			System.out.println(p1.getPid());
		}else {
			System.out.println("Not Found");
		}
	}

}
