package co.akash.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.akash.hibernate.entity.Student;
import co.akash.hibernate.utils.HibernateUtils;

public class HibernateUpdate {
	public static void main(String[] args) {
		SessionFactory sfactory=HibernateUtils.getSessionFactory();
		Session session=sfactory.openSession();
		Session session1=sfactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student s=new Student(101,"Adarsh M",96);
		Student st=session1.get(Student.class,s.getId());
		if(st!=null) {
			session.update(s);
			tx.commit();
		}
		else {
			System.out.println("Student not found!!");
		}
		sfactory.close();
		session.close();
	}
}
