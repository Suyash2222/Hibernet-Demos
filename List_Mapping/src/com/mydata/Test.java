package com.mydata;

import java.util.ArrayList;

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
			
			ArrayList<String> allEmp=new ArrayList<>();
			allEmp.add("Ajay");
			allEmp.add("Vijay");
			allEmp.add("Jay");
			allEmp.add("Ajay");
			
			Department d1=new Department(111,"IT",allEmp);
			
			ArrayList<String> allEmp1=new ArrayList<>();
			allEmp1.add("Hema");
			allEmp1.add("Rekha");
			allEmp1.add("Jaya");
			allEmp1.add("Sushma");
			
			Department d2=new Department(222,"HR",allEmp1);
			
			s.save(d1);
			s.save(d2);
			t.commit();
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
