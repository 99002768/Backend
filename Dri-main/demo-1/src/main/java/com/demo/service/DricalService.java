package com.demo.service;

import java.util.List;

import com.demo.model.Dricalc1;

public interface DricalService {

	List<Dricalc1> getdetails();

	void post(Dricalc1 dricalc);

	Dricalc1 change(Dricalc1 dricalc);

	void delete(Integer id);

}
