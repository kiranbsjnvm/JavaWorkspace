package com.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class UserDetails3 {

	@Id
	private int id;
	
	private String name;
	
	@Temporal(TemporalType.DATE)  //save only date , not entire time stamp
	private Date joinedDate;
	
	@ElementCollection   //this will create new table UserDetails3_listOfAddress and inserts there
	@JoinTable(name="User_Address",
		joinColumns = @JoinColumn(name="User_Id")
	) 												 // Specifying resultant table name and column name
	private Set<Address2> listOfAddress = new HashSet();
	
	
	//This is to create  Primary key Address_id for User_Address table
	/*@ElementCollection   
	@JoinTable(name="User_Address",
		joinColumns = @JoinColumn(name="User_Id")
	) 	
	@GenericGenerator(name="sequence-gen",strategy="sequence")
	@CollectionId(columns = { @Column(name="Address_Id") }, generator = "sequence-gen", type = @Type(type="long"))
	private Collection<Address2> listOfAddress = new ArrayList<Address2>();*/
	
	
	private String description;
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	/*public Set<Address2> getAddressList() {
		return listOfAddress;
	}*/
	
	public Collection<Address2> getAddressList() {
		return listOfAddress;
	}
	public void setAddressList(Set<Address2> address) {
		this.listOfAddress = address;
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
