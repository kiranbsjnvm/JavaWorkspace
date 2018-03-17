package com.Modals;

import java.sql.Date;
import java.util.ArrayList;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import com.CustomValidation.IsValidHobby;

import jdk.nashorn.internal.objects.annotations.SpecializedFunction;

public class Student {
	
	@Pattern(regexp="[^0-9]*")
	@Size(min=4,max=20)
	public String userName;
	
	@NonNull
	@Size(min=2,max=20,message="Please insert minimum {min} and maximum {max} characters") @IsValidHobby
	public String userHobby;
	
	
	@Max(9999)
	public Long mobileNumber;
	
	public Address userAddress;
	
	//public ArrayList<String> userSkills;
	
	
	/*public ArrayList<String> getStudentSkills() {
		return userSkills;
	}
	public void setStudentSkills(ArrayList<String> userSkills) {
		this.userSkills = userSkills;
	}
	*/
	
	public String getUserName() {
		return userName;
	}
	public Address getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserHobby() {
		return userHobby;
	}
	public void setUserHobby(String userHobby) {
		this.userHobby = userHobby;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
