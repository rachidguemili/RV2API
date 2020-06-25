package com.BackApiTest.BackApiTest.patient;

import com.BackApiTest.BackApiTest.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{


}