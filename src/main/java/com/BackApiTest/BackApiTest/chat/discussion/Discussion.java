package com.BackApiTest.BackApiTest.chat.discussion;


import com.BackApiTest.BackApiTest.chat.message.Message;
import com.BackApiTest.BackApiTest.patient.Patient;
import com.BackApiTest.BackApiTest.practician.Practician;

import javax.persistence.*;
import java.util.List;

@Entity
public class Discussion {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	private  String message;

//
//	@OneToMany
//	private List<Message> messageList;

	@ManyToOne
	private Practician practician;

	@ManyToOne
	private Patient patient ;

	public Discussion() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public List<Message> getMessageList() {
//		return messageList;
//	}
//
//	public void setMessageList(List<Message> messageList) {
//		this.messageList = messageList;
//	}

	public Practician getPractician() {
		return practician;
	}

	public void setPractician(Practician practician) {
		this.practician = practician;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
