package com.exceptionHandlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerMethods {

	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Exception ex) 
	{
		System.out.println("Null pointer Exception accured");
		return "NullPointerException";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String genericExceptionHandler(Exception ex){
		
		System.out.println("Unkonown Exception occurred");
		return "Exception";
	}
	
}
