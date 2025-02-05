package com.mydata;

import java.util.HashMap;

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
			
			HashMap<Integer, String>d1=new HashMap<>();
			
			d1.put(111, "Admin");
			d1.put(222, "IT");
			d1.put(444, "Sales");
			d1.put(333, "HR");
			d1.put(444, "Product Sales");
			
			Company c1=new Company(78523, "ABC", d1);
			
			s.save(c1);
			t.commit();
			System.out.println("done");
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
