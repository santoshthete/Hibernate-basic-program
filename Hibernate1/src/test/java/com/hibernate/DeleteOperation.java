package com.hibernate;

import org.hibernate.Session;
import com.hibernate.HibernateUtil;

public class DeleteOperation {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		int id=1;
		Employee e1= session.get(Employee.class, id);
		session.delete(e1);
		System.out.println("Employee deleted ");
		session.getTransaction().commit();
		
		
		
	}

}
