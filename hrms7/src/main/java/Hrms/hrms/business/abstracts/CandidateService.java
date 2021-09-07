package Hrms.hrms.business.abstracts;

import java.util.List;

import Hrms.hrms.entities.concretes.Candidate;

public interface CandidateService {
	
	List<Candidate> getAll();
	void add(Candidate candidate);
	boolean duplicateCheck(Candidate candidate);

}
