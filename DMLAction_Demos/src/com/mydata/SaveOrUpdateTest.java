package com.mydata;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class SaveOrUpdateTest {

	public static void main(String[] args) {
		try 
		{
			Configuration cfg=new AnnotationConfiguration().configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			
			//1.get a object from database
			//2.modify the database object ---by using setter();
			//3.call update and pass modified object
			
			Product dbProduct=(Product)s.get(Product.class, 401);
			
			System.out.println("Database Object= "+dbProduct);
			dbProduct.setCost(55555);
			dbProduct.setQty(22);
			
			System.out.println("After Modification object= "+dbProduct);
			
			s.saveOrUpdate(dbProduct);
			System.out.println("Done");
			t.commit();
			
			
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
