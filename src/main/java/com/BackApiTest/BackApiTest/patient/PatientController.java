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



}
