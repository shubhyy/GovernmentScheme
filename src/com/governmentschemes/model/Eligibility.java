package com.governmentschemes.model;

public class Eligibility {
	private int eligibilityId;
	private int minimumAge;
	private int maximumAge;
	private String profession;
	private String incomeGroup;
	private String gender;

	public int getEligibilityId() {
		return eligibilityId;
	}

	public void setEligibilityId(int eligibilityId) {
		this.eligibilityId = eligibilityId;
	}

	public int getMinimumAge() {
		return minimumAge;
	}

	public void setMinimumAge(int minimumAge) {
		this.minimumAge = minimumAge;
	}

	public int getMaximumAge() {
		return maximumAge;
	}

	public void setMaximumAge(int maximumAge) {
		this.maximumAge = maximumAge;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getIncomeGroup() {
		return incomeGroup;
	}

	public void setIncomeGroup(String incomeGroup) {
		this.incomeGroup = incomeGroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
