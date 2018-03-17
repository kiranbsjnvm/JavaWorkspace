package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/lifecycle/spring.xml");
		context.registerShutdownHook(); // it closes context automatically when application completes execution
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}

}
