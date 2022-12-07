package com.Technosignia.SmartGarage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.SmartGarage.dao.MechanicRepository;
import com.Technosignia.SmartGarage.entity.Mechanic;


@Service
public class MechanicService
{ 
	
	@Autowired
	MechanicRepository mechanicRepository;
	
	public Mechanic createMechanic(Mechanic mechanic)
	{ 
		return mechanicRepository.save(mechanic);

	}
}


