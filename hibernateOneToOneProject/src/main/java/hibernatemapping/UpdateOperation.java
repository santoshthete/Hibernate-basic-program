package hibernatemapping;

import org.hibernate.Session;

//import hibernatemapping.Employee;
import hibernatemapping.HibernateUtil;

public class UpdateOperation {
	public static void main(String[] args) throws NullPointerException {
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		int id=1;
		Student s1=session.get(Student.class, id);
		s1.setFirstName("Pulse");
		session.update(s1);
		System.out.println("Employee updated");
		session.getTransaction().commit();
	}

}

