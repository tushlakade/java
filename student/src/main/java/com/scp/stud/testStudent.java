package com.scp.stud;
import java.util.ArrayList;
//import com.scp.department;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.scp.department.department;
import java.util.List;


public class testStudent {

	public static void main(String[] args) {
		department d;
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		department dept1 =new department(1, "comp");
		department dept2=new department(2, "mech");
		s.save(dept1);
		s.save(dept2);
		s.flush();
		tr.commit();
		
		SessionFactory sf1=new Configuration().configure("hibernate2.cfg.xml").buildSessionFactory();
		Session s1=sf1.openSession();
		Transaction tr1=s1.beginTransaction();
		List<department> list=s1.createQuery("from department").getResultList();
		s1.flush();
		tr1.commit();
		
		SessionFactory sf2=new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
		Session s2=sf2.openSession();
		Transaction tr2=s2.beginTransaction();
		for (department department : list) {
			s2.save(new student(department.getId(), department.getDept_name()));
		}
		s2.flush();
		tr2.commit();
		

	}

}
	
