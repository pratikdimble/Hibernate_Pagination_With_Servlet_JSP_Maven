package com.app.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import org.hibernate.Transaction;

import com.app.model.Student;
import com.app.utility.HibernateUtil;

public class StudentDAOImpl implements StudentDAO {
	
	//***********method for saveStudent(String sname, String semail, String sresult)***********************************

	public int saveStudent(String sname, String semail, String sresult) {
		Session ses=null;
		int idval=0;
		//get the session
		ses=HibernateUtil.getSession();
		//declare the domain class object
			Student s=new Student();
			//set the values
				//s.setSid(sid);
				s.setSname(sname);
				s.setSemail(semail);
				s.setSresult(sresult);
				//save objs
				Transaction tx=null;
				try{
				 tx=ses.beginTransaction();
				   idval=(Integer) ses.save(s);
				 tx.commit();
				 System.out.println("Object is saved....");
				  }//try
				  catch(Exception e){
				    tx.rollback();
				    }
		return idval;
	}//methos() ends
	//***********method for getTotalRecordsCount()***********************************

	public int getTotalRecordsCount() {
		//write the query for get the total row count
		String hql="select count(sid) from "+Student.class.getName();
		 //get the session
		Session ses=HibernateUtil.getSession();
		
		long count=(Long)ses.createQuery(hql).uniqueResult();
		//return the count
		System.out.println("Count id: "+count);
		return (int)count;
		
	}
	//******method for getAllStudents(int pageNumber, int pageSize)***************************
	public List<Student> getAllStudents(int pageNumber, int pageSize) {
		
		String hql="from "+Student.class.getName();
		//get the session
		Session ses=HibernateUtil.getSession();
		
		int idval=0;
		
			//create the query for the display all the recodrs
			Query qry=ses.createQuery(hql);
			//set the first result
				qry.setFirstResult((pageNumber-1)*pageSize);
				//set the max result to display on the page
					qry.setMaxResults(pageSize);
					//execute the list
		List<Student> studList=((org.hibernate.query.Query) qry).list();
		//retutn the list
		return studList;
	}//method() ends
	
}//class close
