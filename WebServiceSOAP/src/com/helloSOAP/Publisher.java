package com.helloSOAP;

import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) 
	{
		Endpoint.publish("http://localhost:9000/hello", new HelloWorldImpl());
		System.out.println("Service started");
	}

}
