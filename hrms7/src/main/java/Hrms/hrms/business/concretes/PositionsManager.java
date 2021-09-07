package Hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.hrms.business.abstracts.PositionsService;
import Hrms.hrms.dataAccess.abstracts.PositionsDao;
import Hrms.hrms.entities.concretes.Positions;



@Service
public class PositionsManager implements PositionsService{

	private PositionsDao positionsDao;
	
	@Autowired
	public PositionsManager(PositionsDao positionsDao) {
		super();
		this.positionsDao = positionsDao;
	}


	@Override
	public List<Positions> getAll() {
		return this.positionsDao.findAll();
	}


	@Override
	public String addPosition(Positions positions) {
		return this.addPosition(positions);
	}


	

}
