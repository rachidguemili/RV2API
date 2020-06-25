package com.BackApiTest.BackApiTest.chat.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {



	@Autowired MessageRepository messageRepository;
}
