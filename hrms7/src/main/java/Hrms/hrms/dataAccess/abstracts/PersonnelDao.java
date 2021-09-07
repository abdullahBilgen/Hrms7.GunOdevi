package Hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrms.entities.concretes.Personnel;

public interface PersonnelDao extends JpaRepository<Personnel, Integer> {

}
