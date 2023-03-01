package com.hibernate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int proid;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Employee> employee;

	public Project() {
		// TODO Auto-generated constructor stub
	}
	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Project [proid=" + proid + ", name=" + name + ", employee=" + employee + "]";
	}
	
}
