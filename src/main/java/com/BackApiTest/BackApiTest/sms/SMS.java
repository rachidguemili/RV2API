package com.BackApiTest.BackApiTest.sms;


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

	public SMS(){ }

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


	@Override
	public String toString() {
		return "SMS{" +
				"to='" + to + '\'' +
				", message='" + message + '\'' +
				'}';
	}
}