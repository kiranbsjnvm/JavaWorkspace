package com.package1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		
		//In normal way
		//Triangle triangle = new Triangle();
		//triangle.draw();

		
		//Using Bean Factory
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/spring.xml"));
		//Triangle triangle = (Triangle)factory.getBean("triangle");
		//triangle.draw();
		
		//******** OR , another method using Application context
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle2 = (Triangle)context.getBean("triangle");
		triangle2.draw();
		
		
	}

}
