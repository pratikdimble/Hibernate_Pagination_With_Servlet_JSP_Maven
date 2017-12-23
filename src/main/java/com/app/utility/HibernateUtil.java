package com.app.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static SessionFactory factory=null;
	//static Configuration cfg=null;
	///static Session ses=null;
	static
	{
		Configuration cfg=null;
	cfg=new Configuration();
	cfg=cfg.configure("/com/app/cfgs/hibernate.cfg.xml");
	factory=cfg.buildSessionFactory();
	}
	
	
	public static Session getSession() {
		Session ses=null;
		if(factory!=null)
		ses=factory.openSession();
		return ses;
	}


	public static void closeSession(Session ses) {
		if(ses!=null)
		// Session ses=null;
				ses.close();
		
	}


	public static void closeFactory() {
		if(factory!=null)
		factory.close();
		
	}
}
