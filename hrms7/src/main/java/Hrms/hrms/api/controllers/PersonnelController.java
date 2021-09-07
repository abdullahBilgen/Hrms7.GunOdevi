package Hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.hrms.business.abstracts.PersonnelService;
import Hrms.hrms.entities.concretes.Personnel;

@RestController
@RequestMapping("/api/personnels")
public class PersonnelController {
	
	private PersonnelService personnelService;
	
	public PersonnelController ( PersonnelService personnelService) {
		super();
		this.personnelService = personnelService;
	}
	
	@GetMapping("/getall")
	public List<Personnel> getAll() {
		return this.personnelService.getAll();
	}

}
