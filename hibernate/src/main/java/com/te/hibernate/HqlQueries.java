package com.te.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HqlQueries {

	public static void main(String[] args) {

		Configuration c = new Configuration();
		c.configure();
		SessionFactory factory = c.buildSessionFactory();
		Session session = factory.openSession();

		String query = "from Student where city='parli'";

		Query<Student> query2 = session.createQuery(query);

		List<Student> list = query2.list();

		list.forEach(System.out::println);

		session.close();

	}
}
