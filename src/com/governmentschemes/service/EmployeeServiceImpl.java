package com.governmentschemes.service;

import java.util.List;

import com.governmentschemes.dao.EmployeeDAO;
import com.governmentschemes.dao.EmployeeDAOImpl;
import com.governmentschemes.model.Application;
import com.governmentschemes.model.Scheme;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDAO EmployeeDAO = new EmployeeDAOImpl();

	@Override
	public Scheme addScheme(Scheme scheme) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Scheme> getActiveSchemes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int verifyEmployeeCredentials(int id, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyScheme(Scheme scheme) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int validateApplication(Application application) {
		// TODO Auto-generated method stub
		return 0;
	}


}
