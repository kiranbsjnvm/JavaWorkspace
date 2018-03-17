package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dto.UserDetails;

public class HibernateTest {

	private static Session session;
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) 
	{
		UserDetails user = new UserDetails();
		user.setUserId(2);
		user.setUserName("second Kumar");
		user.setJoinedDate(new Date());
		user.setAddress("my address");
		user.setDescription("it is descrption");
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//saving data
		/*session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();*/
		
		//getting data
		user = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = session.get(UserDetails.class, 2);
		System.out.println("Retrived user name is : "+user.getUserName());
		
	}

}
