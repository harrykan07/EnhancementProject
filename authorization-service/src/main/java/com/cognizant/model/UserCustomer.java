package com.cognizant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
@Entity(name = "userCustomer")
public class UserCustomer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int uId;
	
	@Column(name = "name")
	@NotBlank(message = "User name cannot be empty")
	private String uName;
	
	@NotBlank(message = "Password cannot be empty!")
	@Pattern(regexp = "^[A-Za-z0-9]+$")
	private String pwd;


}
