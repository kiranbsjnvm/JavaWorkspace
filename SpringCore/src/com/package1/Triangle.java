package com.package1;

public class Triangle {

	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw()
	{
		System.out.println(type+" Triangle drawn");
	}
}