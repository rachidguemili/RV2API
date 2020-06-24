package com.BackApiTest.BackApiTest.service;


import com.BackApiTest.BackApiTest.entity.SMS;
import com.BackApiTest.BackApiTest.repository.SMSRepository;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.twilio.Twilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.net.URI;
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

    public Message send() {
        Twilio.init("ACc6f9555065da7426cabcc3066aa88c17", "4ea7f54c637cba183ab7c6a8c627bc70");

        Message message = Message.creator(new PhoneNumber("+15005550010"),
                new PhoneNumber("+15005550006"),
                "Sample Twilio SMS using Java")
                .create();
        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction
    return message;
    }

    public void receive(MultiValueMap<String, String> smscallback) {
    }
}