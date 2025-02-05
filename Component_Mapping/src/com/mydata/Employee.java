package com.mydata;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name;
	private float salary;
	private Address current_address;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Address getCurrent_address() {
		return current_address;
	}
	public void setCurrent_address(Address current_address) {
		this.current_address = current_address;
	}
	public Employee(int id, String name, float salary, Address current_address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.current_address = current_address;
	}
	public Employee(){}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", current_address=" + current_address
				+ "]";
	}
	
	
	
}
