package com.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class UserDetails {
	
	@Id
	@Column(name="userId")
	private int id;
	
	@Column(name="userName")
	private String name;
	
	@Temporal(TemporalType.DATE)  //save only date , not entire time stamp
	private Date joinedDate;
	
	//@Transient  		//it skips this field to be created in database
	private String address;
	
	@Lob  //large object, telling hibernate that it is large object and it can have any number of chars, not restricting to 255 chars
	private String description;
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
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
