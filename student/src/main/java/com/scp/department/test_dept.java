package com.scp.department;

import java.util.List;

import javax.persistence.QueryHint;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.internal.compile.CriteriaQueryTypeQueryAdapter;

import com.scp.stud.student;

//import hibernate.util.objectCreation;;

public class test_dept {
	
	public static void main(String args[])
	{
		

	SessionFactory sf=new Configuration().configure("hibernate1.cfg.xml").buildSessionFactory();
	Session s=sf.openSession();
	Transaction tr=s.beginTransaction();
	department dept=new department("IT");
	department dept1=new department("COMP");
	s.save(dept);
	s.save(dept1);
	s.flush();
	tr.commit();
    
	/*List<department> list=s.createQuery("from department").getResultList();
	for (department d : list) {
		System.out.println(d.getDept_id()+" "+d.getDept_name());	
	}*/
	s.close();
	
	}
}
