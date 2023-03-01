package com.hibernate;

import org.hibernate.Session;

public class GetOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		int id=7;
		Employee e1=session.get(Employee.class, id);
		
		System.out.println(e1);
		
	}

}
