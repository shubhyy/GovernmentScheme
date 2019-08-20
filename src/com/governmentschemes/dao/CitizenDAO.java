package com.governmentschemes.dao;

import java.util.List;

import com.governmentschemes.model.Application;
import com.governmentschemes.model.Citizen;
import com.governmentschemes.model.Scheme;

public interface CitizenDAO {

	boolean applyToScheme();
	int insertCitizen(Citizen citizen);
	List<Scheme> getActiveSchemes();
	List<Scheme> getApprovedSchemes();
	List<Scheme> getRejectedSchemes();
	//List<Scheme> getPendingSchemes();
	int getApplicationStatus(Application application);
	int verifyCitizenCredentials(String userName, String password);
	
	
}
