package com.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	private static Session session;
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) 
	{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		
		//Inserting data 
		/*for(int i=1;i<=10;i++)
		{
			UserDetails user = new UserDetails();
			user.setUserName("User "+i);
			session.save(user);
		}*/
		
		//getting details
		UserDetails user = session.get(UserDetails.class, 5);
		System.out.println("Retrived User name is : "+user.getUserName());
		
		//Deleting data
		//session.delete(user);
		
		//Updating data
		user.setUserName("Updated User");
		session.update(user);
		
		session.getTransaction().commit();
		session.close();
		
		
	}

}
