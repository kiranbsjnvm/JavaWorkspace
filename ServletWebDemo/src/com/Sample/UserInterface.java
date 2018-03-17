package com.Sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInterface")
public class UserInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public UserInterface() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		out.println("<h3>Reading QueryString dat from 'String getParameter(String name)' : </h3>");
		out.println("<div>");
		out.println("<p> First Name : "+firstName+"</p>");
		out.println("<p> Last Name : "+lastName+"</p>");
		out.println("</div>");
		
		out.println("<h3>Reading QueryString dat from 'Enumeration getParameterNames()' : </h3>");
		Enumeration<String> paramNames =  request.getParameterNames();
		out.println("<div>");
		while (paramNames.hasMoreElements()) {
			String paramName = paramNames.nextElement();
			String paramValue = request.getParameter(paramName);
			out.println("<p>"+paramName+" : "+ paramValue + "</p>");
		}
		out.println("</div>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Inside doPost");
		doGet(request, response);
	}

}
