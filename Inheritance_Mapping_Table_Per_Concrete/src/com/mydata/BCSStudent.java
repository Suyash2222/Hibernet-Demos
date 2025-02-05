package com.mydata;

import java.io.Serializable;

public class BCSStudent extends Student implements Serializable {

	private String subject;
	private float per;
	public BCSStudent(){}
	public BCSStudent(int roll, String name, String address, String subject, float per) {
		super(roll, name, address);
		this.subject = subject;
		this.per = per;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "BCSStudent [subject=" + subject + ", per=" + per + "]";
	}
	
	
	
	
}
