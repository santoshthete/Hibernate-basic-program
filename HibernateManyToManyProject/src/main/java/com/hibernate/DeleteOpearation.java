package com.hibernate;

import org.hibernate.Session;

public class DeleteOpearation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session session=HibernateUtil.getSessionFactory().openSession();
session.beginTransaction();
int id=1;
Employee e1=session.get(Employee.class, id);
session.delete(e1);
session.getTransaction().commit();


	}

}
