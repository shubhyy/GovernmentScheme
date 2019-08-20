package com.governmentschemes.service;

import java.util.List;

import com.governmentschemes.model.Citizen;
import com.governmentschemes.model.Scheme;

public interface CitizenService {
	boolean applyToScheme();
	int addCitizen(Citizen citizen);
	List<Scheme> getActiveSchemes();
	List<Scheme> getApprovedSchemes();
	List<Scheme> getRejectedSchemes();
	//List<Scheme> getPendingSchemes();
	int getSchemeStatus(Scheme scheme);
	int verifyCitizenCredentials(String userName, String password);
}
