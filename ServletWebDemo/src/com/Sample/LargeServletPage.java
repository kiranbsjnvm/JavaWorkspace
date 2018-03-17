package com.Sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utility.GzipUtility;

/**
 * Servlet implementation class LargeServletPage
 */
@WebServlet("/LargeServletPage")
public class LargeServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public LargeServletPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String string = "A mutual fund is at its core a managed portfolio of stocks and/or bonds. You can think of a mutual fund as a company that brings together a large group of people and invests their money on their behalf in this portfolio. Each investor owns shares of the mutual fund, which represent a portion of its holdings";
		
		PrintWriter out;
		if(GzipUtility.isGzipSupported(request) && !GzipUtility.isZipDisabled(request))
		{
			out = GzipUtility.getZipWriter(response);
			response.setHeader("Content-Encoding", "gzip");
			System.out.println("zip writer created");
		}
		else
		{
			out = response.getWriter();
			System.out.println("zip not created");
		}
		
		out.println("<!DOCTYPE HTML>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Show All Request Headers</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3> Show Request Headers</h3>");
		
		for(int i=0;i<10000;i++){
			out.println(string+"</br>");
		}
		
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
