package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.model.UserCustomer;

public interface UserCustomerRepo  extends JpaRepository<UserCustomer, Integer> {
	
	public UserCustomer findByUserName(String name);

}