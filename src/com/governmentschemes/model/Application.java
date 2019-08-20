package com.governmentschemes.model;

public class Application {
	public Application(int applicationId, Scheme scheme, Citizen citizen, String applicationStatus) {
		super();
		this.applicationId = applicationId;
		this.scheme = scheme;
		this.citizen = citizen;
		this.applicationStatus = applicationStatus;
	}

	private int applicationId;
	private Scheme scheme;
	private Citizen citizen;
	private String applicationStatus;

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

}
