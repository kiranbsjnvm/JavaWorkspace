package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello()
	{
		String resource = "<? xml version='1.0' ?>" + 
			"<hello> Hi it is from xml get method </hello>";
		
		return resource;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJson()
	{
		String resource = "";
		
		return resource;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML()
	{
		String resource = "<h1>It is from html method </h1>";
		
		return resource;
	}
	
}
