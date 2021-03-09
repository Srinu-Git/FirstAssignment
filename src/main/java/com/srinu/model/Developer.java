package com.srinu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Developer {
	
	@javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String name;
	private String skills;

}
