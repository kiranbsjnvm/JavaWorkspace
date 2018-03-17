import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletDemo extends HttpServlet{

	private String message ;
	public void init()
	{
		message = "Hello World";
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.println(message+"  ");
		writer.println();
		writer.println(getServletName());
	}
	
	public void detrsoy() 
	{
		//empty
	}
}
