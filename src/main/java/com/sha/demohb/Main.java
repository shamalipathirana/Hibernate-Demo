package com.sha.demohb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Laptop lp = new Laptop();
		lp.setLid(101);
		lp.setLname("Dell");

		Subject sub = new Subject();
		sub.setSubjectId(1);
		sub.setSubjectName("English");
		
		Child child = new Child();
		child.setCid(1);
		child.setcName("Hiruni");
		child.getSubjectList().add(sub);

		User user = new User();
		user.setRoleNo(1);
		user.setUserName("Shamali");
		user.setMarks(90);
		user.setLaptop(lp);
		//user.getSubjectList().add(sub);

		Configuration con = new Configuration().configure().addAnnotatedClass(User.class)
				.addAnnotatedClass(Laptop.class).addAnnotatedClass(Subject.class).addAnnotatedClass(Child.class);;
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.save(lp);
		session.save(user);
		session.save(sub);
		session.save(child);

		// stu10 = (Student)session.get(Student.class,1);

		tx.commit();

	}
}