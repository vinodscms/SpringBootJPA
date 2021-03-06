package com.learn.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	@Column(name="name")
	private String name;
	@Column(name="date_of_joning")
	private Date doj;
	@Column(name="salary")
	private Double salary;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
