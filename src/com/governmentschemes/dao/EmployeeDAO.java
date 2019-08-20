package com.governmentschemes.dao;

import java.util.List;

import com.governmentschemes.model.Application;
import com.governmentschemes.model.Scheme;

public interface EmployeeDAO {

	Scheme insertScheme(Scheme scheme);
	List<Scheme> getActiveSchemes();
	int verifyEmployeeCredentials(int id, String password);
	int updateScheme(Scheme scheme);
	int validateApplication(Application application);
	
}
