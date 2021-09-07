package Hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrms.business.abstracts.EmployerService;
import Hrms.hrms.dataAccess.abstracts.EmployerDao;
import Hrms.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	EmployerDao employerDao;

	@Autowired
	public EmployerManager (EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	
	@Override
	public List<Employer> getAll() {
		
		return employerDao.findAll();
	}

	@Override
	public void add(Employer employer) {
		
		if(this.duplicateCheck(employer)) {
			employerDao.save(employer);
		}
		
	}

	@Override
	public boolean duplicateCheck(Employer employer) {
		
		for(Employer user : this.getAll()) {
			if(user.getEMail() == employer.getEMail()) {
				System.out.println("User email already exists");
				return false;
			}
		}
		
		return true;
	}

}
