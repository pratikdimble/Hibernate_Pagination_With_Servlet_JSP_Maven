package com.app.dao;

import java.util.List;

import com.app.model.Student;

public interface StudentDAO {
 public int saveStudent(String sname,String semail,String sresult);

 	public int getTotalRecordsCount();

	public List<Student> getAllStudents(int pageNumber, int pageSize);
	
	
}
	
