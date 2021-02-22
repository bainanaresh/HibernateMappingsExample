package com.mysql.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="emp_details")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int add_id;

    private String village;

    private String mandal;

    private String district;

    private String state;

    private String zipcode;
    @OneToOne(mappedBy = "address")
    private Employee employee;

}
