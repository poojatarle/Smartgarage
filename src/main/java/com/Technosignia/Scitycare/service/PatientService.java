package com.Technosignia.Scitycare.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.Scitycare.dao.PatientRepository;
import com.Technosignia.Scitycare.entity.Patient;

@Service
public class PatientService {
	
	@Autowired
	PatientRepository patientRepository;
	
	
	public Patient createPatient(Patient patient) {
		return patientRepository.save(patient);
		
	}
	public Optional<Patient> findPatientById(Long id)
	{ 
		return patientRepository.findById(id);
	} 
	
	
	
	public Patient updatePatient(Patient patient, Long id) {
		
	Optional<Patient>	opCust= patientRepository.findById(id);
		Patient cust = opCust.get();
		
		cust.setAddress(patient.getAddress());
		cust.setContact(patient.getContact());
		cust.setEmail(patient.getEmail());
		
		
		return patientRepository.save(cust);
	} 
	
	public String deletePatient(Long id)
	{ 
		patientRepository.deleteById(id);
		return "this was deleted";
	} 

}
