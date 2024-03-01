package com.LearnHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 SessionFactory factory = cfg.buildSessionFactory();
		
		Student st1 = new Student();
		st1.setId(1);
		st1.setName("Arnav");
		st1.setCity("Amritsar");
		Certificate c1 = new Certificate();
		c1.setCourse("Java");
		c1.setDuration("10");
		st1.setCertif(c1);
		
		Student st2 = new Student();
		st2.setId(2);
		st2.setName("Deepak");
		st2.setCity("Kaithal");
		Certificate c2 = new Certificate();
		c2.setCourse("SQL");
		c2.setDuration("4");
		st2.setCertif(c2);
		
		Session session = factory.openSession();
		System.out.println("Session created");
		Transaction tx= session.beginTransaction();
		System.out.println("Transaction created");
		session.save(st1);
		session.save(st2);
		System.out.println("Session saved");
		tx.commit();
		System.out.println("Session commit");
		session.close();
		factory.close();
	}
	
	

}
