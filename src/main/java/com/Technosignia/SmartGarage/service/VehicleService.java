package com.Technosignia.SmartGarage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.SmartGarage.dao.VehicleRepository;
import com.Technosignia.SmartGarage.entity.Vehicle;

@Service
public class VehicleService
{ 
	@Autowired
	VehicleRepository vehicleRepository;
	
	public Vehicle createVehicle(Vehicle vehicle)
	{ 
		return vehicleRepository.save(vehicle);

	}
}
