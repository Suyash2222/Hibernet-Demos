package com.mydata;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class saveTest {

	public static void main(String[] args) {
		
		try 
		{
			Configuration cfg=new AnnotationConfiguration().configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			
			/*
			//save()
			Product p=new Product(101,"Laptop",89532,80);
			s.save(p);
			*/
			
			/*
			//persist()
			Product p1=new Product(901,"Computer",85462,45);
			s.persist(p1);
			*/
			
			//saveOrUpdate
			Product p2= new Product(401,"Mobile",25360,50);
			s.saveOrUpdate(p2);
			
			
			
			
			
			
			
			t.commit();
			
			System.out.println("Done");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
