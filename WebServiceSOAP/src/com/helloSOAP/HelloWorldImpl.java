package com.helloSOAP;

import javax.jws.WebService;

@WebService(endpointInterface="com.helloSOAP.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayMessage(String msg) 
	{
		return "Hi " + msg;
	}

}
