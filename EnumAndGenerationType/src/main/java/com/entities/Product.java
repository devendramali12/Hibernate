package com.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
	  @Id

	    @SequenceGenerator(
	            name = "product_seq_gen",
	            sequenceName = "product_sequence",
	            allocationSize = 1
	    )

	    @GeneratedValue(
	            strategy = GenerationType.SEQUENCE,
	            generator = "product_seq_gen"
	    )

	    private int id;

	    private String name;

}
