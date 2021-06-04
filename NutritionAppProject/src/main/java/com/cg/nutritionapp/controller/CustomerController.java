package com.cg.nutritionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nutritionapp.exceptions.ValidateCustomerException;
import com.cg.nutritionapp.model.Customer;
import com.cg.nutritionapp.serviceimpl.CustomerServiceImpl;


@ComponentScan(basePackages = "com")
@RestController

public class CustomerController {
	@Autowired
	CustomerServiceImpl customerService;

	@PostMapping("/createCustomerDetails")
	public Customer createCustomerDetails(@RequestBody Customer newCustomer) throws ValidateCustomerException{
		return customerService.createCustomerDetails(newCustomer);
	}
	

	@PutMapping("/updateCustomer/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public Customer updateCustomer(@RequestBody Customer updateCustomer) throws ValidateCustomerException{
		return customerService.updateCustomer(updateCustomer);
	}

	@GetMapping("/displayAllCustomer/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public Customer displayAllCustomer(@PathVariable("id") Customer customer) {

		return customerService.displayAllCustomer(customer);
	}

	@DeleteMapping("/deleteCustomer/{id}")
//	@ExceptionHandler(RecordNotFoundException.class)
	public String deleteCustomer(@PathVariable("id") Customer customer) {
		//@RequestBody Dietician dietician

		return customerService.deleteCustomer(customer);
	}
	@GetMapping("/DisplayAllCustomers")  
	private List<Customer> getAllCustomers()   
	{  
	return customerService.getAllCustomers();  
	}  

}

