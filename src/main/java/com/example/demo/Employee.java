package com.example.demo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Employee {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String city;
}
