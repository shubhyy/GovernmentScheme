package com.governmentschemes.dao;

import java.util.List;

import com.governmentschemes.model.Application;
import com.governmentschemes.model.Citizen;
import com.governmentschemes.model.Scheme;

public class CitizenDAOImpl implements CitizenDAO{

	@Override
	public boolean applyToScheme() {
		return false;
	}

	@Override
	public List<Scheme> getActiveSchemes() {
		return null;
	}

	@Override
	public List<Scheme> getApprovedSchemes() {
		return null;
	}

	@Override
	public List<Scheme> getRejectedSchemes() {
		return null;
	}



	@Override
	public int verifyCitizenCredentials(String userName, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertCitizen(Citizen citizen) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getApplicationStatus(Application application) {
		// TODO Auto-generated method stub
		return 0;
	}

}
