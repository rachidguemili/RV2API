package com.BackApiTest.BackApiTest.chat.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {



	@Autowired MessageRepository messageRepository;

	public List<Message> geAll() {
		return messageRepository.findAll();
	}
}
