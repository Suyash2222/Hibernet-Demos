package com.mydata;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class SelectTest {

	public static void main(String[] args) {
		
		try 
		{
			Configuration cfg=new AnnotationConfiguration().configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			/*
			//get()
			Product p=(Product)s.get(Product.class, 101);
			System.out.println(p);
			*/
			
			//load()
			Product p1=(Product)s.load(Product.class, 101);
			System.out.println(p1);
			
			
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
