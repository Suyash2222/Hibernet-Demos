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
			
			Student s1=new Student(201,"Ram","Pune");
			BEStudent s2= new BEStudent(202,"Lakhan","Mumbai","Civil",7);
			BCSStudent s3=new BCSStudent(203,"Lakshman","Delhi","Comp",85.25f);
			
			s.save(s1);
			s.save(s2);
			s.save(s3);
			t.commit();
			System.out.println("Done");
		} 
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
