package com.LearnHibernate.Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Question q1 = new Question();
		q1.setQuestionId(1);
		q1.setQuestion("What is Java?");
		
		Answer a1 = new  Answer();
		a1.setAnswerId(101);
		a1.setAnswer("Java is a Programming lang.");
		
		Answer a2 = new  Answer();
		a2.setAnswerId(102);
		a2.setAnswer("It is based on oops.");
		
		Answer a3 = new  Answer();
		a3.setAnswerId(103);
		a3.setAnswer("Java has different types of frameworks.");
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		q1.setAnswer(list);
		
		//creating session
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//save
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		tx.commit();
		System.out.println("Session closed");
		
		Question que= (Question)session.get(Question.class, 1);
		System.out.println(que);
		System.out.println("Question is: "+que.getQuestion());
		session.close();
		factory.close();
	}

}
