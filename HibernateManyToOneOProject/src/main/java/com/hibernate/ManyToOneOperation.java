package com.hibernate;

import java.util.ArrayList;
import com.hibernate.HibernateUtil;
import org.hibernate.Session;

public class ManyToOneOperation {
	public static void main(String[] args) {
	
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		College college=new College();
		college.setName("symbiosis college");
		
		Departments dept=new Departments();
		dept.setDept("science");
		dept.setCollege(college);
		
		Departments dept1=new  Departments();
		dept1.setDept("arts");
		dept1.setCollege(college);
		
		Departments dept2=new Departments();
		dept2.setDept("commerce");
		dept2.setCollege(college);

		session.save(dept);
		session.save(dept2);
		session.save(dept1);
		session.getTransaction().commit();
		
		
		
		
//		Departments dept=new Departments();
//		dept.setDept("science");
//		Departments dept1=new Departments();
//		dept1.setDept("arts");
//		Departments dept2=new Departments();
//		dept2.setDept("commerce");
//		Departments dept3=new Departments();
//		dept3.setDept("management");
//		
//		ArrayList<Departments> al=new ArrayList<Departments>();
//		al.add(dept);
//		al.add(dept1);	
//		al.add(dept2);
//		al.add(dept3);
//		
//		College college=new College();
//		college.setDepartment(al);
//		college.setName("Symbiosis");
//		
//		session.save(college);
//		session.getTransaction().commit();
//		System.out.println("record insert successfully !!");
//		
	
	
	}

}


















