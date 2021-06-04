package com.cg.nutritionapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.nutritionapp.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long>{
	

}
