package com.Technosignia.SmartGarage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle
{ 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	Long id;
	
	String rtoNo;
	
	String model;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRtoNo() {
		return rtoNo;
	}

	public void setRtoNo(String rtoNo) {
		this.rtoNo = rtoNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

}
