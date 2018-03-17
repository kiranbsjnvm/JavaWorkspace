package com.Sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AutoRefresh")
public class AutoRefresh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AutoRefresh() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		response.setIntHeader("Refresh", 3);
		
		Date currentDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("E dd-MM-yyyy 'at' hh:mm:ss a");
		String currentDateAndTime = format.format(currentDate);
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Show All Request Headers</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3> Show Request Headers</h3>");
		
		out.println("<p>Page Refreshed at : "+currentDateAndTime);
		
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
