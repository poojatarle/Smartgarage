 package com.Technosignia.Scitycare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.Scitycare.entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
