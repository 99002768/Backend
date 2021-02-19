package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.DricalcRepository;
import com.demo.model.Dricalc1;

@Service
public class DricalcServiceImpl implements DricalService {
	
	@Autowired
	DricalcRepository dricalcDao;
	

	@Override
	public List<Dricalc1> getdetails() {
		return dricalcDao.findAll();
	}

	@Override
	public void post(Dricalc1 dricalc) {
		dricalcDao.save(dricalc);
		
	}

	@Override
	public Dricalc1 change(Dricalc1 dricalc) {
		return dricalcDao.save(dricalc);
	}

	@Override
	public void delete(Integer id) {
		dricalcDao.deleteById(id);
		
	}
	
	

}
