package com.BackApiTest.BackApiTest.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussionService {

	@Autowired DiscussionRepository discussionRepository;

	public List<Discussion> getAll() {
		return  discussionRepository.findAll();
	}
}
