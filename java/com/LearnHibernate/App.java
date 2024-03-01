package com.LearnHibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		//First step 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		System.out.println("Welcome to Hibernate "+factory);
		System.out.println(factory.isClosed());
		
		//creating student obj
		Student st = new Student();
		st.setId(101);
		st.setName("Arpit");
		st.setCity("Panchkula");
		System.out.println("Student object created: "+st);
		
		//creating object of address;
		
		Address ad = new Address();
		ad.setStreet("Street 1 ");
		ad.setCity("City 1");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(123.4443);
		
		//Creating session
		Session session = factory.openSession();
//		System.out.println("Session created");
		Transaction tx= session.beginTransaction();
//		System.out.println("Transaction created");
		session.save(st);
		session.save(ad);
//		System.out.println("Session saved");
		tx.commit();
//		System.out.println("Session commit");
		session.close();
		System.out.println("Session closed");
	}

}
