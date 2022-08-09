package com.wipro.homeloans.repository;

import com.wipro.homeloans.model.Admin;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {

}
