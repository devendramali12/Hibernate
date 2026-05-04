package one_to_one_bi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "PersonBi")
@Getter
@Setter
public class Person {
	
	@Id
	private int pid;
	private String name;
	private int age;
	
	
	@OneToOne
	@JoinColumn(name="passid")
	private Passport passport;
}
