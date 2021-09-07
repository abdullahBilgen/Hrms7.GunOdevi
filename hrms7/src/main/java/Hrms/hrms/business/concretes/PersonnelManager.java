package Hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrms.business.abstracts.PersonnelService;
import Hrms.hrms.dataAccess.abstracts.PersonnelDao;
import Hrms.hrms.entities.concretes.Personnel;


@Service
public class PersonnelManager implements PersonnelService {
	
	PersonnelDao personnelDao;

	@Autowired
	public PersonnelManager(PersonnelDao personnelDao) {
		super();
		this.personnelDao = personnelDao;
	}
	
	@Override
	public List<Personnel> getAll() {
		return null;
	}

}
