package com.myapp.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {

	private static SessionFactory sessionFactory;
	
	private HibernateConfiguration(){}
	
	public static SessionFactory getSessionFactory() 
	{
		if(sessionFactory == null)
			sessionFactory = new Configuration().configure().buildSessionFactory();
		
		return sessionFactory;
	}
}
