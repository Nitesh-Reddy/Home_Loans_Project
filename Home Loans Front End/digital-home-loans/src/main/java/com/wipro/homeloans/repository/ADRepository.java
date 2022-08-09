package com.wipro.homeloans.repository;

import com.wipro.homeloans.model.ApplicationDetails;


import org.springframework.data.repository.CrudRepository;

public interface ADRepository extends CrudRepository<ApplicationDetails, String> {

	
}
