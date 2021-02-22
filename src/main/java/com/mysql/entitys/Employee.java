package com.mysql.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="emp_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int emp_id;

    private String name;

    private int age;

    private double salary;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="add_id")
    private Address address;
}
