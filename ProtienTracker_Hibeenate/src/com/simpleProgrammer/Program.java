package com.simpleProgrammer;

import org.hibernate.Session;

import com.Modals.User;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		//Inserting data into DB
		session.beginTransaction();
		User user = new User();
		user.setName("ssss");
		//user.setId(3);
		user.getprotienData().setTotal(50);
		user.getprotienData().setGoals(100);
		session.save(user);
		session.getTransaction().commit();
		
		
		//Reading from DB
		session.beginTransaction();
		User loadedUser = (User) session.get(User.class, 6);
		System.out.println("Name : "+loadedUser.getName());
		System.out.println("Goals : "+loadedUser.getprotienData().getGoals());
		
		//updating data
		loadedUser.getprotienData().setTotal(3333);
		session.getTransaction().commit();
		
		//session.close();
		HibernateUtilities.getSessionFactory().close();
		System.out.println("Opened session and closed");
		
	}

}
