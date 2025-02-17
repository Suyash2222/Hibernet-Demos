package com.mydata;

import java.io.Serializable;

public class Employee implements Serializable{

	private int eid;
	private String name;
	private float salary;
	private String address;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(){}
	public Employee(int eid, String name, float salary, String address) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eid= " + eid + ",Employee name= " + name + ",Employee salary= " + salary + ",Employee address= " + address + "]";
	}
	
	
	
	
}
