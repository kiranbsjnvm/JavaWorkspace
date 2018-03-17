package com.inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  // telling to store all the child and parent data in parent data itself
@DiscriminatorColumn(name="Vehicle_Type",discriminatorType = DiscriminatorType.STRING) // DTYPE column name and its type
public class Vehicle 
{

	@Id
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
