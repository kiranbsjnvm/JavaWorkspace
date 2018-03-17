package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dto.Address2;
import com.dto.UserDetails;
import com.dto.UserDetails2;

public abstract class HibernateTest2 {

	private static Session session;
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) {
		
		UserDetails2 user = new UserDetails2();
		Address2 address = new Address2();
		address.setCity("Hassan");
		address.setPicode("560068");
		
		user.setUserId(1);
		user.setUserName("kiran Kumar");
		user.setJoinedDate(new Date());
		user.setAddress(address);
		user.setDescription("it is descrption");
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
