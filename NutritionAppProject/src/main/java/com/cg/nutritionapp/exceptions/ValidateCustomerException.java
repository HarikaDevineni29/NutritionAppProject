package com.cg.nutritionapp.exceptions;

public class ValidateCustomerException extends Exception {
	private static final long serialVersionUID = 1L;
	public ValidateCustomerException() {
		super();		
	}
	public ValidateCustomerException(String message) {
		super(message);
	}

}
