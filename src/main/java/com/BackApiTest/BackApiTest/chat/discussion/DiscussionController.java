package com.BackApiTest.BackApiTest.chat.discussion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class DiscussionController {

	@Autowired
	DiscussionService discussionService;

	@GetMapping
	public  List<Discussion> getAll(){
		return  discussionService.getAll();
	}
	@GetMapping("/discussions/{id}")
	public List<Discussion> getAllByPatientId(@PathVariable Long id)
	{
		return discussionService.getAllByPatientId(id);
	}




}
