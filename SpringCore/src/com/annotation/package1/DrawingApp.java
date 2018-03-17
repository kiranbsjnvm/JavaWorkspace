package com.annotation.package1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/annotation/package1/spring.xml");
		context.registerShutdownHook();
		Shape shape = (Circle)context.getBean("circle");
		shape.draw();
		Shape shape2 = (Triangle)context.getBean("triangle");
		shape2.draw();
		
		//Shape shape = (Circle)context.getBean("circle");
		//shape.draw();
	}

}
