package com.Modals;

public class User {

	private int id;
	private String name;
	
	private PrtotienData protienData= new PrtotienData();
	
	public User() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PrtotienData getprotienData() {
		return protienData;
	}
	public void setprotienData(PrtotienData protienData) {
		this.protienData = protienData;
	}
}
