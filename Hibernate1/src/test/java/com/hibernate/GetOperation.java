package com.hibernate;

import org.hibernate.Session;
import com.hibernate.HibernateUtil;

public class GetOperation {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	//int id =1;
	Employee e1=session.get(Employee.class, 2);
	System.out.println(e1);
	session.getTransaction().commit();
	
}
}
