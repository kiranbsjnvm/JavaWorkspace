package com.inheritance2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)   
public class Vehicle 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vehileId;
	
	private String vehicleName;
	
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
