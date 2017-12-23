package com.app.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.StudentDAO;
import com.app.dao.StudentDAOImpl;
import com.app.model.Student;

public class DetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentDAO dao=new StudentDAOImpl();
		//declare page size
		int pageSize=3;
			//declare page number
			int pageNumber=1;
				//get the page number 
			String pns=request.getParameter("pageNumber");
			
		if(pns!=null && !"".equals(pns)){
			pageNumber=Integer.parseInt(pns);
		}
			//get the total reccord count
		
			int totalRow=dao.getTotalRecordsCount();
			
			int numberOfPages=totalRow/pageSize + (totalRow%pageSize>0?1:0);
		
			List<Student> studList=dao.getAllStudents(pageNumber,pageSize);
		
			request.setAttribute("studList", studList);
	
			request.setAttribute("numberOfPages", numberOfPages);
	
			request.getRequestDispatcher("records.jsp").forward(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   doGet(request,response);
		}//doPost(-,-)

}
