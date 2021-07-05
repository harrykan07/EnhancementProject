package com.cts.training.collateralwebportal.model;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ApplyLoan {
	private Integer applicationId;
	
	
	private Integer custId;
	
	@NotNull(message = "Enter the Loan Amount")
	private Double loanAmnt;
	
	@NotNull(message = "Tenure should not be blank")
	private Integer tenure;
	
	private String collDetails;
	
	private String stat="Pending";
}
