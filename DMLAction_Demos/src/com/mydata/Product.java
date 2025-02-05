package com.mydata;

import java.io.Serializable;



public class Product implements Serializable {
	
	private int pid;
	private String pname;
	private float cost;
	private int qty;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, float cost, int qty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", cost=" + cost + ", qty=" + qty + "]";
	}
	
	
	
	
	
	
	
	
	

	
	
	
}
