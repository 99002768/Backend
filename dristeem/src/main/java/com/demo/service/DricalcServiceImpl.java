package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.DricalcRepository;
import com.demo.model.Dristeem;

@Service
public class DricalcServiceImpl implements DricalService {
	
	@Autowired
	DricalcRepository dricalcDao;
	

	@Override
	public List<Dristeem> getdetails() {
		return dricalcDao.findAll();
	}

	@Override
	public void post(Dristeem dricalc) {
		dricalcDao.save(dricalc);
		
	}

	@Override
	public Dristeem change(Dristeem dricalc) {
		return dricalcDao.save(dricalc);
	}

	@Override
	public void delete(Integer id) {
		dricalcDao.deleteById(id);
		
	}
	
	

}
