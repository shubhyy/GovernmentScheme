package com.governmentschemes.service;
import java.util.List;

import com.governmentschemes.model.Application;
import com.governmentschemes.model.Scheme;
public interface EmployeeService {
	Scheme addScheme(Scheme scheme);
	List<Scheme> getActiveSchemes();
	int verifyEmployeeCredentials(int id, String password);
	int modifyScheme(Scheme scheme);
	int validateApplication(Application application);
}
