package com.cognizant.authenticationservice.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.authenticationservice.model.BankUser;

public interface UserRepository extends CrudRepository<BankUser, String> {
	BankUser findByUsername(String username);
}
