package com.BackApiTest.BackApiTest.sms;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SMSRepository extends JpaRepository<SMS, Long> {
}