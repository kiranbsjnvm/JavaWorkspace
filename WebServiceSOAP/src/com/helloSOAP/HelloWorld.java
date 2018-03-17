package com.helloSOAP;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {

	@WebMethod 
	public String sayMessage(String msg);
}