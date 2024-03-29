package com.LearnHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	 public static void main(String[] args) {
		//get load
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 
		 //get - student
		 Student st = (Student)session.load(Student.class,101);
		 System.out.println(st);
		 
		 session.close();
		 factory.close();
	}

}
