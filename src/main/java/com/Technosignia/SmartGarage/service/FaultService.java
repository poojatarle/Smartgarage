package com.Technosignia.SmartGarage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.SmartGarage.dao.FaultRepository;
import com.Technosignia.SmartGarage.entity.Fault;

@Service
public class FaultService
{ 
	
	@Autowired
	FaultRepository faultRepository;
	
	public Fault createFault(Fault fault)
	{ 
		return faultRepository.save(fault);
	}

}
