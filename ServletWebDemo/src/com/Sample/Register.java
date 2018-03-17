package com.Sample;

import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Register() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//This method is called when the action in form is GET
		
		/*
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobbies");
		String country = request.getParameter("country");
		String[] languages = request.getParameterValues("language");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<div>");
		out.println("<p>User Name : "+userName+"</p>");
		out.println("<p>Password : "+password+"</p>");
		out.println("<p>Gender : "+gender+"</p>");
		
		out.println("<p>Hobbies : </p>");
		for(int i=0;i<hobbies.length;i++){
			out.println(hobbies[i]+"</br>");
		}
		
		out.println("<p>Country : "+country+"</p>");
		out.println("<p>Langauges Known : </p>");
		for(int i=0;i<languages.length;i++){
			out.println(languages[i]+"</br>");
		}
		*/
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//This method is called when the action in form is POST
		
		PrintWriter out = response.getWriter();
		out.println("<h3>From doPost method </h3>");
		
		//doGet(request, response);
		
		//***************** or  ************************

		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobbies");
		String country = request.getParameter("country");
		String[] languages = request.getParameterValues("language");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h3>From doPost method </h3>");
		out.println("<div>");
		out.println("<p>User Name : "+userName+"</p>");
		out.println("<p>Password : "+password+"</p>");
		out.println("<p>Gender : "+gender+"</p>");
		
		out.println("<p>Hobbies : </p>");
		for(int i=0;i<hobbies.length;i++){
			out.println(hobbies[i]+"</br>");
		}
		
		out.println("<p>Country : "+country+"</p>");
		out.println("<p>Langauges Known : </p>");
		for(int i=0;i<languages.length;i++){
			out.println(languages[i]+"</br>");
		}
		
	}

}
