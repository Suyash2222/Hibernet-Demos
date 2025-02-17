package com.mydata;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class HCQL_Test {

	public static void main(String[] args) {
		
		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		
		/*
		Criteria c=s.createCriteria(Employee.class);
		c.setMaxResults(2);
		c.setFirstResult(1);
		List<Employee>allEmp=c.list();
		for(Employee e:allEmp)
		{
			System.out.println(e);
		}
		*/
		
		/*
		Criteria c=s.createCriteria(Employee.class);
		c.addOrder(Order.desc("salary")).addOrder(Order.asc("name"));
		List<Employee>allEmp=c.list();
		for(Employee e:allEmp)
		{
			System.out.println(e);
		}
		*/
		/*
		Criteria c=s.createCriteria(Employee.class);
		c.add(Restrictions.le("salary", 25000.0f));
		List<Employee>allEmp=c.list();
		for(Employee e:allEmp)
		{
			System.out.println(e);
		}
		*/
		
		
		/*
		Criteria c=s.createCriteria(Employee.class);
		c.add(Restrictions.between("eid", 100, 102));
		List<Employee>allEmp=c.list();
		for(Employee e:allEmp)
		{
			System.out.println(e);
		}
		*/
		
		/*
		Criteria c=s.createCriteria(Employee.class);
		c.setProjection(Projections.max("salary"));
		List<Float>maxSal=c.list();
		System.out.println(maxSal);
		*/
		
		Criteria c=s.createCriteria(Employee.class);
		c.setProjection(Projections.property("name"));
		List<String>allEmp=c.list();
		for(String e:allEmp)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
