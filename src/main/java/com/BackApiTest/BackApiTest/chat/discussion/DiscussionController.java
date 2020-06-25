package com.BackApiTest.BackApiTest.chat.discussion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class DiscussionController {

	@Autowired
	DiscussionService discussionService;

	@GetMapping
	public List<Discussion> getAll()
	{
		return discussionService.getAll();
	}

}