package com.wipro.homeloans.controller;


import com.wipro.homeloans.model.Documents;
import com.wipro.homeloans.repository.DocumentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/documents")
@CrossOrigin(origins="http://localhost:4200")
public class DocumentController {
	
	@Autowired
	private DocumentRepository drepo;
	
	@PostMapping("/documents")
	public String saveData(@RequestBody Documents d){
		drepo.save(d);
	    return "Uploaded Successfully";
		
	}
}
