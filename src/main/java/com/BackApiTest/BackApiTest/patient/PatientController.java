package com.BackApiTest.BackApiTest.patient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@CrossOrigin
public class PatientController {

	@Autowired
	PatientService patientService;


	@GetMapping
	public List<Patient> getAll(){
		return  patientService.getAll();

	}

	@GetMapping("/{id}")
	public Patient getById(@PathVariable  Long id){
		return  patientService.getById(id);
	}

	@PutMapping("/{id}")
	public Patient updatePatient(@PathVariable Long id,@RequestBody Patient patient){
		return patientService.updatePatient(id,patient);
	}


	@PostMapping("/patient")
	public  Patient addPatient(@RequestBody Patient patient){
		return  patientService.addPatient(patient);
	}

	@DeleteMapping("/{id}")
	public void deletePatientBYId(@PathVariable Long id){
		 patientService.deleteById(id);

	}



}
