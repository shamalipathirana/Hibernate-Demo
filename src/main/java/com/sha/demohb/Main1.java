package com.sha.demohb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main1 {

	public static void main(String[] args) {
		
		StudentFullName sn = new StudentFullName();
		sn.setfName("Dimuthu");
		sn.setlName("Silva");
		sn.setmName("Taruka");

		Student stu10 = new Student();
		stu10.setStudentId(11);
		stu10.setfName(sn);
		stu10.setSubjectName("English");

		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(stu10);
		
		//stu10 = (Student)session.get(Student.class,1);
		
		tx.commit();
		
		//System.out.println(stu10);

	}

}
