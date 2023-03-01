package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="department")
public class Departments {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Dept;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private College college;

	


	public Departments() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDept() {
		return Dept;
	}


	public void setDept(String dept) {
		Dept = dept;
	}


	public College getCollege() {
		return college;
	}


	public void setCollege(College college) {
		this.college = college;
	}


	@Override
	public String toString() {
		return "Departments [id=" + id + ", Dept=" + Dept + ", college=" + college + "]";
	}
	
	
	
	
}
