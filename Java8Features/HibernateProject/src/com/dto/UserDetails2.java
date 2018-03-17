package com.dto;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UserDetails2 {

	@Id
	private int id;
	
	private String name;
	
	@Temporal(TemporalType.DATE)  //save only date , not entire time stamp
	private Date joinedDate;
	
	@Embedded
	private Address2 address;
	
	private String description;
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public Address2 getAddress() {
		return address;
	}
	public void setAddress(Address2 address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserId() {
		return id;
	}
	public void setUserId(int userId) {
		this.id = userId;
	}
	public String getUserName() {
		return name;
	}
	public void setUserName(String userName) {
		this.name = userName;
	}

	
	
}
