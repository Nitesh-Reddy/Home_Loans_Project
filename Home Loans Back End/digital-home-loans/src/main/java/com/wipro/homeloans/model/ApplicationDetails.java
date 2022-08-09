package com.wipro.homeloans.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ApplicationDetails")
public class ApplicationDetails {
	
	@Id
	private String id;
	private String propertyLocation;
	private String propertyName;
	private String estimatedAmount;
	private String employmentType;
	private byte age;
	private String OrganizationType;
	private String employerName;
	private long maxLoanAmount;
	private float interestRate;
	private byte tenure;
	private long loanAmount;
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ApplicationDetails() {
		
	}

	public ApplicationDetails(String propertyLocation, String propertyName, String estimatedAmount,
			String employmentType, byte age, String organizationType, String employerName, long maxLoanAmount,
			float interestRate, byte tenure, long loanAmount,String email) {
		this.propertyLocation = propertyLocation;
		this.propertyName = propertyName;
		this.estimatedAmount = estimatedAmount;
		this.employmentType = employmentType;
		this.age = age;
		this.OrganizationType = organizationType;
		this.employerName = employerName;
		this.maxLoanAmount = maxLoanAmount;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.loanAmount = loanAmount;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(String estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getOrganizationType() {
		return OrganizationType;
	}

	public void setOrganizationType(String organizationType) {
		OrganizationType = organizationType;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public long getMaxLoanAmount() {
		return maxLoanAmount;
	}

	public void setMaxLoanAmount(long maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public byte getTenure() {
		return tenure;
	}

	public void setTenure(byte tenure) {
		this.tenure = tenure;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	
}
