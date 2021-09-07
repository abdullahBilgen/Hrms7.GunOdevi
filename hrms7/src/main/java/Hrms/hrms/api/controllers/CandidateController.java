package Hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrms.business.abstracts.CandidateService;
import Hrms.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")

public class CandidateController {
	
	CandidateService candidateService;
	
	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	
	@GetMapping("/getall")
	public List<Candidate> getAll(){
		return this.candidateService.getAll();
	}
	
	@GetMapping("/add")
	public void add(Candidate candidate) {
		this.candidateService.add(candidate);
	}

}
