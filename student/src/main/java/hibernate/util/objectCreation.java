package hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class objectCreation {
	private static SessionFactory sf;
	private static Session s;
	
	
	public static Session getObject() {
		
		if(sf==null)
		{
			sf=new Configuration().configure().buildSessionFactory();
		    s=sf.openSession();
		    return s;
		}
		s=sf.openSession();
		
		return s;
		
	}

}
