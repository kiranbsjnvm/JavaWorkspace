package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class xmlConfigServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Srvlet response from xml configuration </h3>");
		
		String username = request.getParameter("name");
		
		//creating session
		HttpSession session = request.getSession();
		if(username !="" && username!=null)
		{
			session.setAttribute("savedUsername", username);
		}
		
		//Creating context: session is per user and per browser, but context is across all browsers and all users
		ServletContext context = request.getServletContext();
		if(username !="" && username!=null)
		{
			context.setAttribute("savedContextUsername", username);
		}
		
		
		writer.println("</br>");
		writer.print("User name : "+username);
		writer.println("</br>");
		writer.print("Session Saved User name : "+session.getAttribute("savedUsername"));
		writer.println("</br>");
		writer.print("Context Saved User name : "+context.getAttribute("savedContextUsername"));
		
	}

}
