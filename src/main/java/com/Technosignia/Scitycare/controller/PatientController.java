package com.Technosignia.Scitycare.controller;    

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.Scitycare.entity.Patient;
import com.Technosignia.Scitycare.service.PatientService;

@RestController 
public class PatientController {
	
	@Autowired
	PatientService patientService;
	

	@PostMapping("/patient")
	public Patient createPatient(@RequestBody Patient patient)
	{
	
		return patientService.createPatient(patient);
	}
	 @GetMapping("/patient/{id}")
	 public Optional<Patient> findPatientById(@PathVariable Long Id)
	 {
		 return patientService.findPatientById(Id);
	 }
	
	@PutMapping("/patient")
	public Patient updatePatient(@RequestBody Patient patient, @RequestParam Long id)
	{
	return patientService.updatePatient(patient, id);
} 
	
	@DeleteMapping("/patient")
	public void deletePatient(Long id)
	{ 
		patientService.deletePatient(id);
	}
} 