package com.BackApiTest.BackApiTest.chat.message;


import com.BackApiTest.BackApiTest.chat.discussion.Discussion;
import com.BackApiTest.BackApiTest.patient.Patient;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	private  Long id;

	private String text;
	private Date date;

	@ManyToOne
	@JoinColumn(name = "discussion_id")
	private Discussion discussion;



	public Message() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Discussion getDiscussion() {
		return discussion;
	}

	public void setDiscussion(Discussion discussion) {
		this.discussion = discussion;
	}
}
