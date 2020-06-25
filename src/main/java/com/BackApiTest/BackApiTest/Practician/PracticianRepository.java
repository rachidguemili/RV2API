package com.BackApiTest.BackApiTest.Practician;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticianRepository extends JpaRepository<Practician,Long> {
}
