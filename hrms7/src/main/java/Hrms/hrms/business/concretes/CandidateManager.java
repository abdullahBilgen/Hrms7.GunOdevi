package Hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Hrms.hrms.business.abstracts.CandidateService;
import Hrms.hrms.dataAccess.abstracts.CandidateDao;
import Hrms.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	CandidateDao candidateDao;
	MernisKpsServiceAdapter mernisKpsServiceAdapter;

	@Override
	public List<Candidate> getAll() {
		
		return candidateDao.findAll();
	}

	@Override
	public void add(Candidate candidate) {
		if(mernisKpsServiceAdapter.isValid(candidate)&& this.duplicateCheck(candidate)) {
			candidateDao.save(candidate);
		} else {
			System.out.println("User is not valid.");
		}
		
	}

	@Override
	public boolean duplicateCheck(Candidate candidate) {
		for(Candidate user : this.getAll()) {
			if(user.getEMail() == candidate.getEMail() || user.getIdentityNumber() == candidate.getIdentityNumber()) {
				System.out.println("User email or identity number already exists.");
				return false;
			}
		}
		return true;
	}
}