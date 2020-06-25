package com.BackApiTest.BackApiTest.chat.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class MessageController {


	@Autowired MessageService messageService;

	@GetMapping("/messages")
	public List<Message> getAll(){
		return messageService.geAll();
	}



}
