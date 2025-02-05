package com.mydata;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Test {

	public static void main(String[] args) {
		
		try 
		{
			Configuration cfg=new AnnotationConfiguration().configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Roll No, Name, Percentage");
			int r=sc.nextInt();
			String n=sc.next();
			float p=sc.nextFloat();
			
			Student s1=new Student(r,n,p);
			
			s.save(s1);
			t.commit();
			System.out.println("done");
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
