package com.sha.demohb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Student stu10 = new Student();
		stu10.setName("Hesanya");
		stu10.setStudentSubject("English");

		Configuration con = new Configuration();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		session.save(stu10);

	}

}
