package com.te.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("project created");
		// SessionFactory factory=new Configuration().configure().buildSessionFactory();
		// or
		Configuration cfg = new Configuration();
		// if file path is not found then specify file path
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// factory will give Session object which has various methods for crud
		Student std = new Student();
		std.setId(102);
		std.setName("navaj");
		std.setCity("banglore");
		
		Address ad = new Address();
		ad.setStreet("street7");
		ad.setCity("tokyo");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.44);
		
		//reading image
		FileInputStream stream = new FileInputStream("src/main/java/pic.jfif");
        byte[] data=new byte[stream.available()];
        stream.read(data);
        ad.setImage(data);
        
		Session session = factory.openSession();
		
		Transaction ts = session.beginTransaction();
		session.save(std);
		session.save(ad);
		ts.commit();

		session.close();

	}
}
