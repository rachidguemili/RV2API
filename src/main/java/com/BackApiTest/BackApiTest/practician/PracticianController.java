package com.BackApiTest.BackApiTest.practician;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/practician")
public class PracticianController {

	@Autowired PracticianService practicianService;

	@GetMapping
	public List<Practician> getAll(){
		return  practicianService.getAll();

	}

	@GetMapping("/{id}")
	public Practician getById(@PathVariable Long id){
		return  practicianService.getById(id);
	}


}
