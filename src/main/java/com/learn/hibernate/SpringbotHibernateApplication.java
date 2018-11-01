package com.learn.hibernate;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.hibernate.dao.EmployeeDAO;
import com.learn.hibernate.entity.Employee;

@SpringBootApplication
public class SpringbotHibernateApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbotHibernateApplication.class, args);
	}

	@Autowired
	EmployeeDAO employeeDAO;
	@Override
	public void run(String... args) throws Exception {
		Employee employee= getEmployee();
		employeeDAO.createEmployee(employee);
		employeeDAO.selectEmployee();
		
	}
	
	
	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setName("Joyappan");
		employee.setSalary(160.00);
		employee.setDoj(new Date());
		return employee;
	}
}
