package Hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.hrms.entities.concretes.Positions;

public interface PositionsDao extends JpaRepository<Positions, Integer> {

}
