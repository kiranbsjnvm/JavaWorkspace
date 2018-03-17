package com.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserDetails4 {

	@Id
	private int userId;
	
	private String userName;
	
	/*@OneToOne
	@JoinColumn(name="Vehicle_Id")
	private Vehicle vehicle;*/
	
	@OneToMany  // JoinTable can be done for OneToOne also
	@JoinTable(name = "User_Vehicle",
		joinColumns = @JoinColumn(name="User_Id"),
		inverseJoinColumns = @JoinColumn(name="Vehicle_Id")
	)
	private Collection<Vehicle> vehicles = new ArrayList<>();
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/*public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}*/
	
	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
}
