package com.mydata;

import java.util.HashSet;

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
			
			HashSet<String> d1=new HashSet<>();
			d1.add("IT");
			d1.add("Sales");
			d1.add("Admin");
			d1.add("HR");
			d1.add("Sales");
			
			Company c1=new Company(11235,"ABCSolutions","Mumbai",d1);
			
			HashSet<String> d2=new HashSet<>();
			d2.add("Admin");
			d2.add("Sales");
			d2.add("Training");
			
			Company c2=new Company(45562,"Netways","Pune",d2);
			
			s.save(c1);
			s.save(c2);
			t.commit();
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
