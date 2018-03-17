package com.myapp.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.myapp.config.HibernateConfiguration;
import com.myapp.dao.ContactDAO;
import com.myapp.dto.Contact;


@Repository("contactDAO")
public class ContactDAOImpl implements ContactDAO {

	private static SessionFactory sessionFactory;
	private static Session session;
	
	public boolean add(Contact contact) 
	{
		//sessionFactory = HibernateConfiguration.getSessionFactory();
		sessionFactory =  new Configuration().configure().buildSessionFactory();
		
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(contact);
			session.save(contact.getAdress());
			session.getTransaction().commit();
			session.close();
			System.out.println("saved Succesfully");
			return true;
		} catch (Exception e) {
			System.out.println("Failed to save");
			System.out.println(e);
			return false;
		}
		
	}

	public Contact get(int id) {
		
		sessionFactory = HibernateConfiguration.getSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		Contact contact = session.get(Contact.class, id);
		return contact;
	}

}
