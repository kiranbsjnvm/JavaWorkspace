package com.inheritance2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateTest {

	private static Session session;
	private static SessionFactory sessionFactory;
	
	public static void main(String[] args) 
	{
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Vehicle name");
		
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("FZ");
		bike.setSteeringHandle("Bike Steering handle");
		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("Verna");
		car.setSteeringWheel("Car Steering Wheel");
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(vehicle);
		session.save(bike);
		session.save(car);
		session.getTransaction().commit();
		
		session.close();
		
	}

}
