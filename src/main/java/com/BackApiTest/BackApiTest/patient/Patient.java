package com.BackApiTest.BackApiTest.patient;

import com.BackApiTest.BackApiTest.chat.discussion.Discussion;
import com.BackApiTest.BackApiTest.practician.Practician;
import com.BackApiTest.BackApiTest.sms.SMS;

import javax.persistence.*;
import java.util.List;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;
	private String lastName;
	private  Long socialSecurityNo;

	@ManyToOne
	@JoinColumn(name = "practician_id")
	private Practician practician;

	@OneToMany
	private List<Discussion> discussion;

	@OneToMany
	private List<SMS> smsList;


	public Patient() {
	}

	public List<Discussion> getDiscussion() {
		return discussion;
	}

	public void setDiscussion(List<Discussion> discussion) {
		this.discussion = discussion;
	}

	public List<SMS> getSmsList() {
		return smsList;
	}

	public void setSmsList(List<SMS> smsList) {
		this.smsList = smsList;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getSocialSecurityNo() {
		return socialSecurityNo;
	}

	public void setSocialSecurityNo(Long socialSecurityNo) {
		this.socialSecurityNo = socialSecurityNo;
	}

	public Practician getPractician() {
		return practician;
	}

	public void setPractician(Practician practician) {
		this.practician = practician;
	}
}
