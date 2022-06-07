package com.masai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.modelEntity.Cab;
import com.masai.repository.CabDao;
@Service
public class CabServicesImpl implements CabServices {

	@Autowired
	private CabDao cabdao;
	@Override
	public Cab addNewcab( Cab cab) {
		
		Cab newCab=cabdao.save(cab);
		return newCab;
	}

}
