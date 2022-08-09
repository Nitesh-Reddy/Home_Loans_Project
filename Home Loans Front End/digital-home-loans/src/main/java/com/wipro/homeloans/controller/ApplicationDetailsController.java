package com.wipro.homeloans.controller;

import com.wipro.homeloans.model.ApplicationDetails;
import com.wipro.homeloans.repository.ADRepository;
import com.wipro.homeloans.repository.ApplicationDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
@CrossOrigin(origins="http://localhost:4200")
public class ApplicationDetailsController {
	
	@Autowired
	private ApplicationDetailsRepository appdetailsrepo;
	
	@Autowired
	private ADRepository adrepo;
	
	@PostMapping("/add")
    public String saveBook(@RequestBody ApplicationDetails app){
        appdetailsrepo.save(app);
       
        return "Added Successfully";
    }
}