package com.mydata;

import java.io.Serializable;

public class BEStudent extends Student implements Serializable{
	
	private String stream;
	private int grade;
	public BEStudent(){}
	public BEStudent(int roll, String name, String address, String stream, int grade) {
		super(roll, name, address);
		this.stream = stream;
		this.grade = grade;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "BEStudent [stream=" + stream + ", grade=" + grade + "]";
	}
	
	
	
}
