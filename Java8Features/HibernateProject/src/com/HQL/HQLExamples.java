package com.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLExamples {

	private static Session session;
	private static SessionFactory sessionFactory;
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		
		
		/*Employee employee1 = new Employee();
		employee1.setName("Safiya");
		employee1.setSalary(60000);
		Address address1 = new Address();
		address1.setAddressLine1("Marathalli");
		address1.setCity("Bangalore");
		address1.setZipcode("5601111");
		employee1.setAddress(address1);
		
		Employee employee2 = new Employee();
		employee2.setName("Sai");
		employee2.setSalary(80000);
		Address address2 = new Address();
		address2.setAddressLine1("HSR");
		address2.setCity("Bangalore");
		address2.setZipcode("562222");
		employee2.setAddress(address2);*/
		
		
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		/*session.save(employee1);
		session.save(employee2);
		session.save(address1);
		session.save(address2);*/
		
		
		//Getting all the list
		Query query = session.createQuery("from Employee");
		List<Employee> empList = query.list();
		System.out.println("All Employee list");
		for (Employee employee : empList) {
			System.out.println(employee.getId()+" "+employee.getName());
		}
		
		//HQL example - Get Employee with id
		/*System.out.println("*******************************************************");
		query = session.createQuery("from Employee where id = :id");
		query.setInteger("id", 2);
		Employee employee = (Employee)query.uniqueResult();
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getAddress().getCity());*/
		
		
		
		//HQL pagination example
		/*System.out.println("*******************************************************");
		query = session.createQuery("from Employee");
		query.setFirstResult(0);
		query.setFetchSize(2);
		empList = query.list();
		//System.out.println(empList.size());
		for(Employee emp4 : empList){
			System.out.println("Paginated Employees::"+emp4.getId()+","+emp4.getName()+","+emp4.getAddress().getCity());
		}*/
		
		//HQL Update Employee
		/*System.out.println("*******************************************************");
		query = session.createQuery("update Employee set emp_name = :name where emp_id= :id");
		query.setParameter("name", "Kiran Kumar");
		query.setLong("id", 1);
		int result = query.executeUpdate();
		System.out.println("Employee Update Status="+result);*/
		
		
		//HQL Delete Employee, we need to take care of foreign key constraints too
		/*System.out.println("*******************************************************");
		query = session.createQuery("delete from Employee where emp_id= :id");
		query.setLong("id", 34);
		int result = query.executeUpdate();
		System.out.println("Employee Delete Status="+result);
		session.getTransaction().commit();
		session.close();
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		query = session.createQuery("delete from Address where address_id= :id");
		query.setLong("id", 36);
		result = query.executeUpdate();
		System.out.println("Address Delete Status="+result);
		session.getTransaction().commit();
		session.close();*/
		
		
		//HQL Aggregate function examples
		/*System.out.println("*******************************************************");
		query = session.createQuery("select sum(salary) from Employee");
		double sumSalary = (Double) query.uniqueResult();
		System.out.println("Sum of all Salaries= "+sumSalary);*/
		
		
		//HQL join examples
		/*System.out.println("*******************************************************");
		query = session.createQuery("select e.name, a.city from Employee e INNER JOIN e.address a");
		List<Object[]> list = query.list();
		for(Object[] arr : list){
			System.out.println(Arrays.toString(arr));
		}*/
			
		
		//HQL group by and like example
		/*System.out.println("*******************************************************");
		query = session.createQuery("select e.name, sum(e.salary), count(e) from Employee e where e.name like '%i%' group by e.name");
		List<Object[]> groupList = query.list();
		for(Object[] arr : groupList){
			System.out.println(Arrays.toString(arr));
		}*/
		
		//HQL order by example
		System.out.println("*******************************************************");
		query = session.createQuery("from Employee e order by e.id desc");
		empList = query.list();
		for(Employee emp3 : empList){
			System.out.println("ID Desc Order Employee::"+emp3.getId()+","+emp3.getAddress().getCity());
		}
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
