package co.akash.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.akash.hibernate.entity.Batch;
import co.akash.hibernate.entity.Faculty;
import co.akash.hibernate.utils.HibernateUtils;

public class HibernateCascade {

	public static void main(String[] args) {
		SessionFactory sfactory=HibernateUtils.getSessionFactory();
		Session session=sfactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Faculty f=new Faculty(100,"Prof. Ross Gellar");
		Batch b=new Batch("B01","Paleontology",f);
		
		
		session.save(f);
		session.save(b);
		
		tx.commit();
		sfactory.close();
		session.close();
		

	}

}
