package com.hibernate;

import org.hibernate.Session;
import com.hibernate.HibernateUtil;

public class UpdateOperation {

	public static void main(String[] args) throws NullPointerException {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
//		int id=1;
		Employee e1=session.get(Employee.class, 2);
		e1.setAddress("Delhi");
		session.update(e1);
		System.out.println("Employee updated");
		session.getTransaction().commit();
	}

}
