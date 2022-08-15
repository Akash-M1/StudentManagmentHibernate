package co.akash.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.akash.hibernate.entity.Student;
import co.akash.hibernate.utils.HibernateUtils;

public class HibernateInsert {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SessionFactory sfactory=HibernateUtils.getSessionFactory();
		Session session=sfactory.openSession();
		Transaction tx=session.beginTransaction();
		
		System.out.println("Enter details of 10 students");
		
		for(int i=0;i<10;i++) {
			System.out.println("Enter Student Id :");
			int id=sc.nextInt();
			System.out.println("Enter the student Name :");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter Student Marks :");
			int marks=sc.nextInt();
			Student s=new Student(id,name,marks);
			session.save(s);
		}
		
		tx.commit();
		
		sfactory.close();
		session.close();
		
	}
}
