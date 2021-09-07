package Hrms.hrms.business.abstracts;

import java.util.List;

import Hrms.hrms.entities.concretes.Positions;


public interface PositionsService {
	
	List<Positions> getAll();
    String addPosition(Positions positions);
	

}
