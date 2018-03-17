package com.converter;

import javax.xml.ws.Endpoint;

public class ServicePublisher {

	public static void main(String[] args) 
	{
		//http://localhost:9902/UC?wsdl  = url to see wsdl in browser
		
		Endpoint.publish("http://localhost:9902/UC", new UnitsConverterImpl());
		
		System.out.println("Web Service Started");
	}

}
