package Hrms.hrms.business.abstracts;

import java.util.List;

import Hrms.hrms.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
	void add(Employer employer);
	boolean duplicateCheck(Employer employer);

}
