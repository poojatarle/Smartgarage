package com.Technosignia.SmartGarage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.Technosignia.SmartGarage.entity.Fault;
import com.Technosignia.SmartGarage.service.FaultService;

@RestController
public class FaultController 
{ 
	
	@Autowired
	FaultService faultService;
	
	@PostMapping("/fault")
	public Fault createFault (@RequestBody Fault fault)
	{ 
	
		return faultService.createFault(fault);
	}
		

}
