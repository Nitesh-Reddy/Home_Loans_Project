package com.wipro.homeloans.repository;

import com.wipro.homeloans.model.ApplicationDetails;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApplicationDetailsRepository extends MongoRepository<ApplicationDetails, String> {

}
