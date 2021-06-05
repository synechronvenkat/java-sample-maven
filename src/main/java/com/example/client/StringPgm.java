package com.example.client;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringPgm {
// Optional class
	// default methods
	// method references
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1> list=Arrays.asList(new Employee1(1,"venkat",20),new Employee1(1,"ramesh",200),new Employee1(1,"ramesh",120));
		list.sort(Comparator.comparing(Employee1::getName).thenComparingInt(Employee1::getSalary));
		//list=list.stream().sorted(Comparator.comparing(Employee1::name)).collect(Collectors.toList());
		System.out.println(list);

	}

}
class Employee1 implements Comparable<Employee1>
{
	int id;
	String name;
	int salary;
	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee1 o) {
		return this.name.compareTo(o.name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
