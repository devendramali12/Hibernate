package one_to_one_bi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Passport {

	@Id
	private int pid;
	
	private int valid;
	
	@OneToOne(mappedBy = "passport")
	private Person person;
}
