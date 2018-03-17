package com.withInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/withInterface/spring.xml");
		context.registerShutdownHook();
		
		Shape shape = (Triangle)context.getBean("triangle");
		shape.draw();
		
		//Shape shape = (Circle)context.getBean("circle");
		//shape.draw();
	}

}
