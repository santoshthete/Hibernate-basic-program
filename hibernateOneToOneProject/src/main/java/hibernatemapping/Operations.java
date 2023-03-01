package hibernatemapping;



import java.util.Scanner;

import org.hibernate.AssertionFailure;
import org.hibernate.Session;
import hibernatemapping.Student;
import hibernatemapping.HibernateUtil;

public class Operations {
	public static void main(String[] args) throws NullPointerException {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Account account=new Account();
		account.setAccountNumber("100");
		account.setBookName("tatayan");
        
        
        Student student=new Student();
		
		student.setFirstName("rahul");
		student.setLastName("patil");
		student.setDepartment("Fiction book Store");
	
		student.setAccount(account);
		
		
		
		session.save(student);
		
		
		session.getTransaction().commit();
		session.close();
		System.out.println("get trasaction complete");

		
		
//			session.beginTransaction();
//			int id=1;
//			Student s1=session.get(Student.class, id);
//			session.delete(s1);
//			session.getTransaction().commit();
//		
			
			
			//		session.beginTransaction();
//		//int id=1;
//		Student s3=session.get(Student.class, 2);
//		s3.setDepartment("Novel");
//		session.update(s3);
//		session.getTransaction().commit();
//
//		
//		session.beginTransaction();
//		Student s4=session.get(Student.class, 3);
//		session.getTransaction().commit();

		
	  
		
		
		
		//return s;
	}
	}


