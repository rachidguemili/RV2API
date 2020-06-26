package com.BackApiTest.BackApiTest.patient;

import com.BackApiTest.BackApiTest.practician.Practician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepository;

	public List<Patient> getAll() {
		return  patientRepository.findAll();
	}


	public Patient getById(Long id) {
		return patientRepository.findById(id).get();
	}

	public Patient updatePatient(Long id,Patient patient) {
		Patient tempoPatient;

		if (patientRepository.findById(id)== null) return null;

		 tempoPatient=patientRepository.findById(id).get();
		tempoPatient.setFirstName(patient.getFirstName());
		tempoPatient.setLastName(patient.getLastName());
		tempoPatient.setPractician(patient.getPractician());
		tempoPatient.setSocialSecurityNo(patient.getSocialSecurityNo());


		return patientRepository.save(tempoPatient);
	}

	public Patient addPatient(Patient patient) {
		Patient tempoPatient;

		if (patient.getId()== null) return null;


		Practician tempoPractician = patient.getPractician();
		patient.setPractician(tempoPractician);
		return  patientRepository.save(patient);
	}

	public void deleteById(Long id) {

		if (patientRepository.findById(id)!= null)
			patientRepository.deleteById(id);
	}
}
