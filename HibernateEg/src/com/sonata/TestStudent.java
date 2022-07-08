package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setStdId(2000);
		s.setStdName("Priya");
		
		SessionFactory session=new Configuration().configure().buildSessionFactory();
		Session s1=session.openSession();
		s1.beginTransaction();
		s1.save(s);
		s1.getTransaction().commit();
		s1.close();

	}

}
