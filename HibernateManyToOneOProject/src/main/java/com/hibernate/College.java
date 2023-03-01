package com.hibernate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	
//	@ManyToOne(cascade = CascadeType.ALL)
//private List<Departments> department;
//	
	
//	public List<Departments> getDepartment() {
//		return department;
//	}
//	public void setDepartment(List<Departments> department) {
//		this.department = department;
//	}
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
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
