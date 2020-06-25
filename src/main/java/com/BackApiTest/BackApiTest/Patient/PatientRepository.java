package com.BackApiTest.BackApiTest.Patient;

import com.BackApiTest.BackApiTest.Patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
