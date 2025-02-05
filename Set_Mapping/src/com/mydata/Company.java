package com.mydata;

import java.io.Serializable;
import java.util.Set;

public class Company implements Serializable {
	
	private int reg_id;
	private String cname;
	private String address;
	private Set<String> depts;
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<String> getDepts() {
		return depts;
	}
	public void setDepts(Set<String> depts) {
		this.depts = depts;
	}
	public Company(int reg_id, String cname, String address, Set<String> depts) {
		super();
		this.reg_id = reg_id;
		this.cname = cname;
		this.address = address;
		this.depts = depts;
	}
	public Company(){}
	@Override
	public String toString() {
		return "Company [reg_id=" + reg_id + ", cname=" + cname + ", address=" + address + ", depts=" + depts + "]";
	}
	
	
	
	
	
}
