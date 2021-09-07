package Hrms.hrms.business.concretes;

import org.springframework.stereotype.Service;

import Hrms.hrms.business.abstracts.UserValidatorService;
import Hrms.hrms.entities.concretes.Candidate;
import Hrms.hrms.webService.MernisKpsService;

@Service
public class MernisKpsServiceAdapter implements UserValidatorService<Candidate> {

	@Override
	public boolean isValid(Candidate candidate) {
		
		MernisKpsService mernisKpsService = new MernisKpsService();
		
		return mernisKpsService.authenticate(Long.parseLong(candidate.getIdentityNumber()),candidate.getFirstName(),candidate.getLastName(),candidate.getBirthYear());
	}
}


