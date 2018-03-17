package com.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Address2 {

	private String streat;
	private String city;
	private String picode;
	
	
	public String getStreat() {
		return streat;
	}
	public void setStreat(String streat) {
		this.streat = streat;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPicode() {
		return picode;
	}
	public void setPicode(String picode) {
		this.picode = picode;
	}
	
	
}
