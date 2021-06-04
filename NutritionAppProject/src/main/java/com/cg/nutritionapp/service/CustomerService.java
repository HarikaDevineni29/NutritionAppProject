package com.cg.nutritionapp.service;


import com.cg.nutritionapp.exceptions.ValidateCustomerException;
import com.cg.nutritionapp.model.Customer;


public interface CustomerService {
	
	Customer createCustomerDetails(Customer customer) throws ValidateCustomerException;

	Customer updateCustomer(Customer customer) throws ValidateCustomerException;

	 String deleteCustomer(Customer customer);
	 Customer displayAllCustomer(Customer customer);


}
