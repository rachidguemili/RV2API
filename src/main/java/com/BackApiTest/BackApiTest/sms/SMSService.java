package com.BackApiTest.BackApiTest.sms;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.List;

@Service
public class SMSService {

	@Autowired
	SMSRepository repository;

	@Value("#{systemEnvironment['TWILIO_ACCOUNT_SID']}")
	private String ACCOUNT_SID;

	@Value("#{systemEnvironment['TWILIO_AUTH_TOKEN']}")
	private String AUTH_TOKEN;

	@Value("#{systemEnvironment['TWILIO_PHONE_NUMBER']}")
	private String FROM_NUMBER;


	public List<SMS> getAll(){
		return repository.findAll();
	}

	public SMS getById(Long id){
		return repository.findById(id).get();
	}

	public Message send() {
		Twilio.init("ACce572c1b0688ed980807f9871cb8866f", "685f90a290f07af112832addb464f426");



		Message message = Message.creator(new PhoneNumber("+33 6 05 56 7772"),
				new PhoneNumber("+12056971633"),
				"Ceci est un message de votre médecin")
				.create();

		//System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction
		return message;
	}

	public SMS save(SMS Sms){
		return repository.save(Sms);
	}





	public void receive(MultiValueMap<String, String> smscallback) {
	}
}