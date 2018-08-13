package thanhtrung.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
	try {
		
		// create a student object
		
		System.out.println("crete a student object..........");
		
		
		// start a Transaction;
		
		session.beginTransaction();
		
		// save the student object
		System.out.println("Saving the student object");
	
		// commit transaction
		
		session.getTransaction().commit();
		
		System.out.println("Done!");
		
	}catch (Exception e) {
		System.out.println("Error");
	}finally {
		
		factory.close();
		
	}
		
	}

}
