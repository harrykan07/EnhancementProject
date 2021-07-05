package com.cognizant.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.cognizant.model.UserCustomer;
import com.cognizant.repository.UserCustomerRepo;

public class UserCustomerDetailServiceImpl implements UserDetailsService 
{
	
	@Autowired
	UserCustomerRepo customerRepo;

	
	/**
	 * Overriding method to load the customer details from database with user name
	 * 
	 * @param userName
	 * @return This returns the user name and password
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserCustomer cust=customerRepo.findByUserName(username);
		return new User(cust.getUName(), cust.getPwd(), new ArrayList<>());
	}
	
	public UserCustomer loadCustomerByUsername(String username) {
		UserCustomer cust= customerRepo.findByUserName(username);
		return cust;
	}

}
