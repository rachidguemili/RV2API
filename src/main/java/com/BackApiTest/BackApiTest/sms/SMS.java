package com.BackApiTest.BackApiTest.sms;


import com.BackApiTest.BackApiTest.patient.Patient;

import javax.persistence.*;

@Entity
@Table(name="SMS")
public class SMS {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name ="destinataire")
	private String to;

	@Column(name="message")
	private String message;

	@OneToOne
	@JoinColumn(name = "patient_id")
	Patient patient;


	public SMS(){ }

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}