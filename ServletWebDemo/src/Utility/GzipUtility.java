package Utility;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GzipUtility {

	public static boolean isGzipSupported(HttpServletRequest request) 
	{	
		String encoding = request.getHeader("Accept-Encoding");
		return ((encoding !=null) && encoding.contains("gzip"));
	}
	
	public static boolean isZipDisabled(HttpServletRequest request) 
	{
		String flag = request.getParameter("disableGzip");
		return ((flag != null) && (!flag.equalsIgnoreCase("false")));
	}
	
	public static PrintWriter getZipWriter(HttpServletResponse response) throws IOException 
	{
		return new PrintWriter(new GZIPOutputStream(response.getOutputStream()));
	}
}
