package com.mydata;

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
			
			Address ad=new Address("Pune","MH","411102");
			Employee e1=new Employee(101,"jay",5000,ad);
			
			Address ad1=new Address("Indore","MP","478563");
			Employee e2=new Employee();
			e2.setId(901);
			e2.setName("Komal");
			e2.setSalary(99285);
			e2.setCurrent_address(ad1);
			
			s.save(e1);
			s.save(e2);
			t.commit();
			
			System.out.println("Done");
		} 
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
