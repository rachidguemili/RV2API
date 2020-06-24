package com.BackApiTest.BackApiTest;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackApiTestApplication {

	public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
	public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

	public static void main(String[] args) {

		//Message.creator()
		System.out.println(ACCOUNT_SID);
		System.out.println(AUTH_TOKEN);



		SpringApplication.run(BackApiTestApplication.class, args);
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);


	}


}
