package com.wipro.homeloans.repository;

import com.wipro.homeloans.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
