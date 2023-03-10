package com.te.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Student std = new Student();
		std.setId(100);
		std.setCity("ambajogai");
		std.setName("Abhishek");
		
		Certificate cer = new Certificate();
		cer.setCourse("java");
		cer.setDuration("6 months");
		std.setCerti(cer); 
		
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(std);
		
		tx.commit();
		session.close();
	}
}
