package com.BackApiTest.BackApiTest.practician;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PracticianService {


	@Autowired PracticianRepository practicianRepository;

	public Practician getById(Long id) {
		return  practicianRepository.findById(id).get();
	}

	public List<Practician> getAll() {
		return practicianRepository.findAll();
	}
}
