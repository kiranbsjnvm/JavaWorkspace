package com.annotation.package2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() 
	{
		System.out.println("Drawing Circle");
		System.out.println("Circle points are  : "+center.getX()+" , "+center.getY());
	}

}
