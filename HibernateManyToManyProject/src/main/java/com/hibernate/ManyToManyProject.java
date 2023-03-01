package com.hibernate;

import java.util.ArrayList;

import org.hibernate.Session;

public class ManyToManyProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Project project=new Project();
		project.setName("ABC");
		Project project1=new Project();
		project1.setName("PQR");
		Project project2=new Project();
		project2.setName("XYZ");
		Project project3=new Project();
		project3.setName("LMN");
		ArrayList<Project> al=new ArrayList<Project>();
		al.add(project3);
		al.add(project2);
		al.add(project1);
		al.add(project);
		
		Employee employee=new Employee();
		employee.setName("Sagar");
		Employee employee1=new Employee();
		employee1.setName("Rohan");
		Employee employee2=new Employee();
		employee2.setName("Ajit");
		Employee employee3=new Employee();
		employee3.setName("Nikhil");
		ArrayList<Employee> elist=new ArrayList<Employee>();
		elist.add(employee3);
		elist.add(employee2);
		elist.add(employee1);
		elist.add(employee);
		
		employee.setProject(al);
		employee1.setProject(al);
		employee2.setProject(al);
		employee3.setProject(al);
		
		project.setEmployee(elist);
		project1.setEmployee(elist);
		project2.setEmployee(elist);
		project3.setEmployee(elist);
//		
//		employee.getProject().add(project);
//		employee1.getProject().add(project1);
//		employee2.getProject().add(project2);
//		employee3.getProject().add(project3);
		
		//employee.setName(null);
//		employee.setProject(al);
//		project.setEmployee(elist);
		//project.setName(null);
		session.save(employee);
		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		
		
		session.save(project);
		session.save(project1);
		session.save(project2);
		session.save(project3);
		
		
		session.getTransaction().commit();
		System.out.println("Data insert successfully");
	}

}
