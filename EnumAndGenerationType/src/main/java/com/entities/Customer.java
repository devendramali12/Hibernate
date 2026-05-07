package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "customer")
public class Customer {

    @Id

    @TableGenerator(
            name = "customer_gen",

            table = "id_generator",

            pkColumnName = "gen_name",

            valueColumnName = "gen_value",

            pkColumnValue = "customer_id",

            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "customer_gen"
    )

    private int id;

    private String name;

   
}