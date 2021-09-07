package Hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrms.business.abstracts.EmployerService;
import Hrms.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/emloyers")

public class EmployerController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public List<Employer> getAll(){

		return this.employerService.getAll();
	}
	
	@GetMapping("/add")
	public void add(Employer employer) {
		this.employerService.add(employer);
	}

}
