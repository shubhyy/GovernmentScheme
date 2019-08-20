package com.governmentschemes.model;

import java.util.Date;



public class Citizen {
	private int citizenId;
	private String userName;
	private String password;
	private String fullName;
	private Date DateOfBirth;
	private String gender;
	private String email;
	private int phoneNumber;
	private String address;
	private String incomeGroup;
	private String profession;
	private String aadharNumber;
	
	public Citizen(int citizenId, String fullName, Date dateOfBirth, String gender, String email, int phoneNumber,
			String address, String incomeGroup, String profession, String aadharNumber, String panNumber) {
		super();
		this.citizenId = citizenId;
		this.fullName = fullName;
		DateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.incomeGroup = incomeGroup;
		this.profession = profession;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
	}

	private String panNumber;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(int citizenId) {
		this.citizenId = citizenId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIncomeGroup() {
		return incomeGroup;
	}

	public void setIncomeGroup(String incomeGroup) {
		this.incomeGroup = incomeGroup;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

}
