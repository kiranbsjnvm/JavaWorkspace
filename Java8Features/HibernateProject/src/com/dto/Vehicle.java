package com.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {

	@Id
	private int vehileId;
	
	private String vehicleName;

	//adding reverse mapping
	@ManyToOne
	private UserDetails4 user;
	
	
	public UserDetails4 getUser() {
		return user;
	}

	public void setUser(UserDetails4 user) {
		this.user = user;
	}

	public int getVehileId() {
		return vehileId;
	}

	public void setVehileId(int vehileId) {
		this.vehileId = vehileId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
}
