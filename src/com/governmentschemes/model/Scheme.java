package com.governmentschemes.model;

import java.util.Date;
import java.util.List;



public class Scheme {
	private String schemeName;
	private int schemeId;

	private String summary;
	private String schemeDescription;
	private String ministry;
	private String sector;
	private Date startDate;
	private String schemeStatus;
	private Eligibility eligibility;
	private List<Bank> bankList;
	private List<Document> documentList;

	public String getSchemeName() {
		return schemeName;
	}

	public Scheme(String schemeName, int schemeId, String summary, String schemeDescription, String ministry,
			String sector, Date startDate, String schemeStatus, Eligibility eligibility, List<Bank> bankList,
			List<Document> documentList) {
		super();
		this.schemeName = schemeName;
		this.schemeId = schemeId;
		this.summary = summary;
		this.schemeDescription = schemeDescription;
		this.ministry = ministry;
		this.sector = sector;
		this.startDate = startDate;
		this.schemeStatus = schemeStatus;
		this.eligibility = eligibility;
		this.bankList = bankList;
		this.documentList = documentList;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public List<Bank> getBankList() {
		return bankList;
	}

	public void setBankList(List<Bank> bankList) {
		this.bankList = bankList;
	}

	public List<Document> getDocumentList() {
		return documentList;
	}

	public void setDocumentList(List<Document> documentList) {
		this.documentList = documentList;
	}

	public int getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSchemeDescription() {
		return schemeDescription;
	}

	public void setSchemeDescription(String schemeDescription) {
		this.schemeDescription = schemeDescription;
	}

	public String getMinistry() {
		return ministry;
	}

	public void setMinistry(String ministry) {
		this.ministry = ministry;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getSchemeStatus() {
		return schemeStatus;
	}

	public void setSchemeStatus(String schemeStatus) {
		this.schemeStatus = schemeStatus;
	}

	public Eligibility getEligibility() {
		return eligibility;
	}

	public void setEligibility(Eligibility eligibility) {
		this.eligibility = eligibility;
	}

}
