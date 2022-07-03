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
	
	User user = new User();
	user.setRoleNo(1);
	user.setUserName("Shamali");
	user.setMarks(90);
	
	Configuration con = new Configuration().configure().addAnnotatedClass(User.class).addAnnotatedClass(Laptop.class);
	SessionFactory sf = con.buildSessionFactory();
	Session session = sf.openSession();
	
	Transaction tx = session.beginTransaction();
	session.save(lp);
	session.save(user);
	
	//stu10 = (Student)session.get(Student.class,1);
	
	tx.commit();
	
	

}
}