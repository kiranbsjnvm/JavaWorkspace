package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dto.Address2;
import com.dto.UserDetails2;
import com.dto.UserDetails3;

public class HibernateTest3 {

	private static Session session;
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) 
	{

		UserDetails3 user = new UserDetails3();
		user.setUserId(4);
		user.setUserName("kiran Kumar");
		user.setJoinedDate(new Date());
		user.setDescription("it is descrption");
		
		Address2 address1 = new Address2();
		address1.setCity("Hassan");
		address1.setPicode("573116");
		
		Address2 address2 = new Address2();
		address2.setCity("Bangalore");
		address2.setPicode("560068");
		
		user.getAddressList().add(address1);
		user.getAddressList().add(address2);
		
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

}
