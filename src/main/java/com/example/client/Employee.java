package com.example.client;

public class Employee {
	
	private String name;
	private String salary;
	
	public Employee()
	{
		
	}

	public Employee(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	

}
