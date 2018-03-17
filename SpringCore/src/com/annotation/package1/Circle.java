package com.annotation.package1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	//@Required
	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() 
	{
		System.out.println("Drawing Circle");
		System.out.println("Circle points are  : "+center.getX()+" , "+center.getY());
	}

	@PostConstruct
	public void initializCircle() 
	{
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroy() 
	{
		System.out.println("Destroy of Circle");
	}
}
