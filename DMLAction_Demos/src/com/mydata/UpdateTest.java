package com.mydata;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class UpdateTest {

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
			
			/*
			//update()
			Product dbproduct=(Product)s.get(Product.class, 401);
			System.out.println("DB Object= "+dbproduct);
			dbproduct.setCost(35000);
			dbproduct.setQty(35);
			*/
			
			//merge()
			Product dbproduct=(Product)s.get(Product.class, 401);
			System.out.println("DB Object= "+dbproduct);
			dbproduct.setCost(22222);
			dbproduct.setQty(22);
			System.out.println("After Modification= "+dbproduct);
			s.merge(dbproduct);
			
			
			
			
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
