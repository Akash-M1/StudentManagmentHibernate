package co.akash.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.akash.hibernate.entity.Student;
import co.akash.hibernate.utils.HibernateUtils;

public class HibernateRetrive {

	public static void main(String[] args) {
		SessionFactory sfactory=HibernateUtils.getSessionFactory();
		Session session=sfactory.openSession();
		
		String hql="from co.akash.hibernate.entity.Student";
		
		Query<Student> query=session.createQuery(hql,Student.class);
		List<Student> list=query.getResultList();
		for(Student s:list) {
			System.out.println(s);
		}
		session.close();
		sfactory.close();
		

	}

}
