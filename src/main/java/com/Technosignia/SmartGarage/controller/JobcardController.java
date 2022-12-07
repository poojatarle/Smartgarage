package com.Technosignia.SmartGarage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.SmartGarage.entity.Jobcard;
import com.Technosignia.SmartGarage.service.JobcardService;

@RestController
public class JobcardController
{ 
	
	@Autowired
	JobcardService jobcardrService;
	
	@PostMapping("/jobcard")
	public Jobcard createJobcard (@RequestBody Jobcard jobcard)
	{ 
	
		return jobcardrService.createJobcard(jobcard);
		
	} 
	
	@GetMapping("/jobcard")
	List<Jobcard> findAllJobcards()
	{ 
		return jobcardrService.listAllJobcards();
	}

}
