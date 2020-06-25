package com.BackApiTest.BackApiTest.Patient;

import com.BackApiTest.BackApiTest.Practician.Practician;

import javax.persistence.*;

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

	public Patient() {
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
