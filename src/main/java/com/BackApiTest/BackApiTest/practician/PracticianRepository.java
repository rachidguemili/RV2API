package com.BackApiTest.BackApiTest.practician;


import com.BackApiTest.BackApiTest.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticianRepository extends JpaRepository<Practician,Long>{



}