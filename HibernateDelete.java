package co.akash.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import co.akash.hibernate.utils.HibernateUtils;

public class HibernateDelete {
	public static void main(String[] args) {
		SessionFactory sfactory=HibernateUtils.getSessionFactory();
		Session session=sfactory.openSession();
		Transaction tx=session.beginTransaction();
		
		String hql="delete from co.akash.hibernate.entity.Student where marks<35";
		Query query=session.createQuery(hql);
		int rows=query.executeUpdate();
		System.out.println("Number of Rows deleted "+rows);
		tx.commit();
		sfactory.close();
		session.close();
		
	}
}
