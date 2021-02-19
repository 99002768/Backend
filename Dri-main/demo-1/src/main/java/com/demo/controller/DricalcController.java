package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Dricalc1;
import com.demo.service.DricalService;


@RestController
@RequestMapping("dricalc")
public class DricalcController {
	
	@Autowired
	DricalService dricalcService;
	
	@CrossOrigin
	@GetMapping("/getdetails")
	public List<Dricalc1> details() {
		return dricalcService.getdetails();
	}
	@CrossOrigin
	@PostMapping("/postdetails")
	public String post(@RequestBody Dricalc1 dricalc) {
	         System.out.println("rsaa");
	         dricalcService.post(dricalc);
		     return "posted successfully";
	}
	@CrossOrigin
	@PutMapping("/modifydetails")
	public Dricalc1 modify(@RequestBody Dricalc1 dricalc) {
		return dricalcService.change(dricalc);
	}
	@CrossOrigin
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id")Integer id) {
		dricalcService.delete(id);
		return "Successfully deleted";
				
	}

}
