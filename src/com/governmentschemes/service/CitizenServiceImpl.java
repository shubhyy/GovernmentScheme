package com.governmentschemes.service;

import java.util.List;

import com.governmentschemes.dao.CitizenDAO;
import com.governmentschemes.model.Citizen;
import com.governmentschemes.model.Scheme;

public class CitizenServiceImpl implements CitizenService{

	@Override
	public boolean applyToScheme() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Scheme> getActiveSchemes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Scheme> getApprovedSchemes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Scheme> getRejectedSchemes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSchemeStatus(Scheme scheme) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int verifyCitizenCredentials(String userName, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addCitizen(Citizen citizen) {
		// TODO Auto-generated method stub
		return 0;
	}

}
