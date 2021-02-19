package com.demo.service;

import java.util.List;

import com.demo.model.Dristeem;

public interface DricalService {

	List<Dristeem> getdetails();

	void post(Dristeem dricalc);

	Dristeem change(Dristeem dricalc);

	void delete(Integer id);

}
