package com.LearnHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	
	//for using it as primary key we use @ID
	@Id
	private int id;
	private String name;
	private String city;
	private Certificate certif;
	
	public Certificate getCertif() {
		return certif;
	}

	public void setCertif(Certificate certif) {
		this.certif = certif;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	
}
