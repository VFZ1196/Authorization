package com.Authorization.model;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Varify {
	
   Random random = new Random();

	public static double getRandomNumber(double min, double max) {
		double r = (int)(Math.random()*(max-min+1)+min);
		return r;
	}
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private Long number = (long) getRandomNumber(1000,2000);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Varify [random=" + random + ", id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	
	
	
}
