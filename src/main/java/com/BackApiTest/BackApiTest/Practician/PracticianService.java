package com.BackApiTest.BackApiTest.Practician;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PracticianService {


	@Autowired PracticianRepository practicianRepository;

}
