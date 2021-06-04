package com.cg.nutritionapp.service;

import org.springframework.http.ResponseEntity;

import com.cg.nutritionapp.exceptions.UserException;
import com.cg.nutritionapp.exceptions.ValidateUserException;
import com.cg.nutritionapp.model.Dietician;
import com.cg.nutritionapp.model.SignUp;


public interface DieticianService {
	
	 Dietician createDieticianDetails(Dietician dietician) throws UserException;

	 Dietician updateDietician(Dietician dietician);

	 String deleteDietician(Dietician dietician);
	 Dietician displayAllDietician(Dietician dietician);

}
