package com.hibernate;
import com.hibernate.HibernateUtil;
import org.hibernate.Session;
//import com.hibernate.mapping.HibernateUtil;

public class CreateOperation {
	public static void main(String[] args) throws NullPointerException {
		Session session=HibernateUtil.getSessionFactory().openSession();
		
//		
//		session.beginTransaction();
//		int id =1;
//		Employee e1=session.get(Employee.class, id);
//		System.out.println(e1);
//		session.getTransaction().commit();
				Employee e1=createEmployee();
		session.beginTransaction();
		session.save(e1);
		System.out.println("employee saved successfully");
		session.getTransaction().commit();
		
		
	}
	private static Employee createEmployee() {
		System.out.println("inside the create method");
		Employee e= new Employee();
		e.setFirstName("Santosh");
		e.setLastName("Thete");
		e.setUsername("abc@123");
		e.setAddress("pune");
		e.setContact("4545");
		System.out.println("Employee=="+e);
		
		return e;
		
	}
	}


