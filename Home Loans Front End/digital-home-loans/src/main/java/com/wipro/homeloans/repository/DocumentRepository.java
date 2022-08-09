package com.wipro.homeloans.repository;

import com.wipro.homeloans.model.Documents;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DocumentRepository extends MongoRepository<Documents, String> {

}
