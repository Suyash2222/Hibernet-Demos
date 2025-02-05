package com.mydata;

import java.io.Serializable;
import java.util.Map;

public class Company implements Serializable{
	 
	private int reg_id;
	private String cname;
	private Map<Integer, String> department;
	
	
	public int getReg_id() {
		return reg_id;
	}
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Map<Integer, String> getDepartment() {
		return department;
	}
	public void setDepartment(Map<Integer, String> department) {
		this.department = department;
	}
	public Company(){}
	public Company(int reg_id, String cname, Map<Integer, String> department) {
		super();
		this.reg_id = reg_id;
		this.cname = cname;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Company [reg_id=" + reg_id + ", cname=" + cname + ", department=" + department + "]";
	}
	
	
	
	
}
