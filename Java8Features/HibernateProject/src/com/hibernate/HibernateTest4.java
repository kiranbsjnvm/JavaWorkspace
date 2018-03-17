package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dto.UserDetails4;
import com.dto.Vehicle;

public class HibernateTest4 {

	private static Session session;
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) 
	{

		UserDetails4 user = new UserDetails4();
		user.setUserId(1);
		user.setUserName("kiran Kumar");
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehileId(1);
		vehicle1.setVehicleName("FZ");
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehileId(2);
		vehicle2.setVehicleName("Verna");
		
		user.getVehicles().add(vehicle1);
		user.getVehicles().add(vehicle2);
		
		//Adding reverse mapping
		vehicle1.setUser(user);
		vehicle2.setUser(user);
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(user);
		session.save(vehicle1);
		session.save(vehicle2);
		session.getTransaction().commit();
		
		session.close();
	}
	
}
