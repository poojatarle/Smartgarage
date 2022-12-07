package com.Technosignia.SmartGarage.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Jobcard 
{ 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	Long id;
	
	String jcNo;
	
	@OneToMany
	List<Fault> faults;
	
	@OneToOne
	Customer customer;
	
	@OneToOne
	Vehicle vehicle;
	
	@OneToOne
	Mechanic mechanic;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJcNo() {
		return jcNo;
	}

	public void setJcNo(String jcNo) {
		this.jcNo = jcNo;
	}

	public List<Fault> getFaults() {
		return faults;
	}

	public void setFaults(List<Fault> faults) {
		this.faults = faults;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Mechanic getMechanic() {
		return mechanic;
	}

	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}
	
	

}
