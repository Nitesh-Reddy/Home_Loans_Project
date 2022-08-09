package com.wipro.homeloans.repository;

import java.util.Optional;

import com.wipro.homeloans.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.ModelAttribute;

public interface URepository extends CrudRepository<User,String> {

	public User findByEmailId(String emailId);
	

	public Optional<User> findById(String id);
}
