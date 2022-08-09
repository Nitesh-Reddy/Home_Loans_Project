package com.wipro.homeloans.model;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {

	@Id
	private String id;
	
	private String  firstName;
	
	private String  lastName;
	private String  emailId;
	private String  password;
	private long phoneNumber;
	private Date dob;
	
	private String gender;
	
	private Long adharNumber;
	private String panNumber;
	
	private boolean accept;
	
	
	
	public boolean isAccept() {
		return accept;
	}


	public void setAccept(boolean accept) {
		this.accept = accept;
	}


	public User() {
		//TODO Auto-generated constructor stub
	}


	public User(String firstName, String lastName, String emailId, String password,
			long phoneNumber, Date dob, String gender, Long adharNumber, String panNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
		this.gender = gender;
		
		this.adharNumber = adharNumber;
		this.panNumber = panNumber;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
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


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Long getAdharNumber() {
		return adharNumber;
	}


	public void setAdharNumber(Long adharNumber) {
		this.adharNumber = adharNumber;
	}


	public String getPanNumber() {
		return panNumber;
	}


	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	
}
