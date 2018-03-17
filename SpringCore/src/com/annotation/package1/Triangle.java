package com.annotation.package1;

import org.springframework.beans.factory.annotation.Autowired;

public class Triangle implements Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	
	@Autowired
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	@Autowired
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	
	@Autowired
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() 
	{
		System.out.println("Drawing Triangle");
		System.out.println("Point A : "+getPointA().getX()+","+getPointA().getY());
		System.out.println("Point B : "+getPointB().getX()+","+getPointB().getY());
		System.out.println("Point C : "+getPointC().getX()+","+getPointC().getY());
	}
	
}
