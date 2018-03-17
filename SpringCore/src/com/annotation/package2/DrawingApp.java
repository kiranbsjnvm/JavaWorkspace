package com.annotation.package2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/annotation/package2/spring.xml");
		Shape shape = (Circle)context.getBean("circle");
		shape.draw();
		
	}

}
