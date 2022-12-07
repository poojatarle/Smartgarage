package com.Technosignia.SmartGarage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.SmartGarage.dao.JobcardRepository;
import com.Technosignia.SmartGarage.entity.Jobcard;

@Service
public class JobcardService 
{ 
	
	@Autowired
	JobcardRepository jobcardRepository;
	
	public Jobcard createJobcard(Jobcard jobcard)
	{ 
		return jobcardRepository.save(jobcard);
	}
	
	
	public List<Jobcard> listAllJobcards()
	{ 
		return jobcardRepository.findAll();
	}

}
