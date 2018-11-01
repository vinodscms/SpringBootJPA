package com.learn.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.hibernate.entity.Employee;
import com.learn.hibernate.util.HibernateUtilConfig;

@Repository
public class EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void createEmployee(Employee employee){
		Session session= null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Integer id =(Integer) session.save(employee);
			System.out.println("Employee is created With Id::"+id);
			session.getTransaction().commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

public void selectEmployee(){
	Session session= null;
	try {
		session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.beginTransaction();
		Query query = session.createQuery("from Employee");
		List<Employee> employeeList = query.list();
		session.getTransaction().commit();
		session.close();
		System.out.println("employeeList size  :: " + employeeList.size());
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}}