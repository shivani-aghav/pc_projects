package com.te.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory factory = cf.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		Student student = session.load(Student.class, 104);
		Address address = session.get(Address.class, 3);
//		System.out.println(address.getCity());
//		Address address1 = session.get(Address.class, 3);
//		System.out.println(address.getCity());
		
//		System.out.println(address);
		System.out.println(student);
//		System.out.println(student.getName());
		tr.commit();
		session.close();
	}
}
