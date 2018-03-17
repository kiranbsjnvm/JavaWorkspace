
package com.Modals;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)  //include properties in jason only when value is not null
@JsonIgnoreProperties({"mobileNumber"})
@JsonPropertyOrder({"Name","mobileNumber","studentHobby","studentAddress"}) //show in mentioned order
public class Student2 {
	
	@JsonProperty("Name")
	public String studentName;
	
	public String studentHobby;
	
	public Long mobileNumber;
	
	public Address studentAddress;
	
	
	public String getStudentName() {
		return studentName;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
