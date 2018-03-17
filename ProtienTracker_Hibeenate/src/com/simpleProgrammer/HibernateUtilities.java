package com.simpleProgrammer;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtilities {

	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	static
	{
		try {
		
			//Configuration configuration = new Configuration().configure();
			//serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			//sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			StandardServiceRegistry standardRegistry = 
				       new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
					Metadata metaData = 
				        new MetadataSources(standardRegistry).getMetadataBuilder().build();
					sessionFactory = metaData.getSessionFactoryBuilder().build();
		
			
		} catch (Exception e) {
			System.out.println("Problem while creating Session factory");
			System.out.println(e.getStackTrace());
		}
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
