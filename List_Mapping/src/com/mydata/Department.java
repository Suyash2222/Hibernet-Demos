package com.mydata;

import java.io.Serializable;
import java.util.List;

public class Department implements Serializable{
	
	private int did;
	private String dname;
	private List<String> employees;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<String> getEmployees() {
		return employees;
	}
	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}
	public Department(){}
	
	public Department(int did, String dname, List<String> employees) {
		super();
		this.did = did;
		this.dname = dname;
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", employees=" + employees + "]";
	}
	
	
	
	
}
