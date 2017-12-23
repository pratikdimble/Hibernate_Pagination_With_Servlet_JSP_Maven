package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.StudentDAO;
import com.app.dao.StudentDAOImpl;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//set the content type		
		response.setContentType("text/html");
		//get the writer
			PrintWriter out = response.getWriter();
				//get vlaues from html page
					//String id = request.getParameter("sid");
					//int sid=Integer.parseInt(id);
						String sname = request.getParameter("sname");
							String semail = request.getParameter("semail");
								String sresult = request.getParameter("sresult");
									//call the service method
						StudentDAO std = new StudentDAOImpl();
							//call the add method and send parameters 
							int idval=std.saveStudent(sname,semail,sresult);
							// response.sendRedirect("./success");
									String msg="Student saved with "+idval;
									request.setAttribute("msg", msg);
								
			//request dispatcher for calling another html file i.e include into our app
					RequestDispatcher req_Dispatcher =request.getRequestDispatcher("/index.jsp");
						//include method 
					req_Dispatcher.forward(request, response);
		}//doPost() close
	}//class close
