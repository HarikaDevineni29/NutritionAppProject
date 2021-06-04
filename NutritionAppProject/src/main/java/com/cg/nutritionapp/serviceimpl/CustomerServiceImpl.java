package com.cg.nutritionapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nutritionapp.constants.AllConstants;
import com.cg.nutritionapp.exceptions.RecordNotFoundException;
import com.cg.nutritionapp.exceptions.ValidateCustomerException;
import com.cg.nutritionapp.model.Customer;
import com.cg.nutritionapp.repository.CustomerRepository;
import com.cg.nutritionapp.service.*;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository customerRepository;
	
@Override
	
	public Customer createCustomerDetails(Customer customer) throws ValidateCustomerException{
		// TODO Auto-generated method stub
		//validateUser(dietician);
	validateUser(customer);
		Optional<Customer> findCustomerById = customerRepository.findById(customer.getId());
			if (!findCustomerById.isPresent()) {
				return customerRepository.save(customer);
				
			} else
				throw new ValidateCustomerException(
						"Customer with Id: " + customer.getId() + " already exists!!");
		} 
	

	@Override
	public Customer updateCustomer(Customer customer) throws ValidateCustomerException {
		// TODO Auto-generated method stub
		//validateUser(signUp);
		validateUser(customer);
		Optional<Customer> findCustomerById = customerRepository.findById(customer.getId());
		if (findCustomerById.isPresent()) {
			customerRepository.save(customer);
		} else
			throw new RecordNotFoundException(
					"Customer with Id: " + customer.getId() + " not exists!!");
		return customer;
	}

	//@Override
	public  String deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Optional<Customer> findCustomerById = customerRepository.findById(customer.getId());
		if (findCustomerById.isPresent()) {
			customerRepository.deleteById(customer.getId());
			return "Customer Deleted!!";
		} else
			throw new RecordNotFoundException("Customer not found for the entered CustomerID");
	}
	public Customer displayAllCustomer(Customer customer){
		Optional<Customer> findCustomerById =  customerRepository.findById(customer.getId());
		if(findCustomerById.isPresent()) {
			return findCustomerById.get();
		}else {
			throw new RecordNotFoundException(" Customer doesn't exist with Id : " +customer.getId());
		}
	
	}
	public void validateUser(Customer customer) throws ValidateCustomerException {
		if (customer.getIntensity()<1 || customer.getIntensity()>10) {
			throw new ValidateCustomerException(AllConstants.INVALID_INTENSITY);
		}
		if (!customer.getStatus().matches("Active") && !customer.getStatus().matches("Blocked")) {
			throw new ValidateCustomerException(AllConstants.STATUS_INVALID);
		}
		
	}


	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> customer = new ArrayList<Customer>();  
		customerRepository.findAll().forEach(customer1 -> customer.add(customer1));  
		return customer;  
	}

}
