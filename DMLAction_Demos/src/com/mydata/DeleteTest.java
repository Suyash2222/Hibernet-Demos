package com.mydata;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class DeleteTest {

	public static void main(String[] args) {
		
		try 
		{
			Configuration cfg = new Configuration().configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();

			
			//get object from database
			//call delete() method---- pass the object
			
			
			Product p=(Product)s.get(Product.class, 101);
			s.delete(p);
			t.commit();
			System.out.println("Done");
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
